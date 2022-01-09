package LeThiNgocNhu;

import java.io.InputStream;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSetFactory;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.query.ResultSetRewindable;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;

public class truyvanspo {
	static Model loadFromFile(String inputFileName) {
//		String inputFileName = "D:/App Repository/TEMP/jena.apache.org/vc-db-1.rdf";

		// create an empty model
		Model model = ModelFactory.createDefaultModel();

		// use the FileManager to find the input file
		
		InputStream in = FileManager.get().open(inputFileName);
		if (in == null) {
			throw new IllegalArgumentException("File: " + inputFileName + " not found");
		}

		// read the RDF/XML file
		model.read(in, "");
		return model;
	}

	public static void main(String[] args) {
		Model model = loadFromFile("C:/Users/18t10/eclipse-workspace/web/dulieungocnhu.rdf");
		// Lấy ra hết các phát biểu có dạng S-V-O
		
		String queryString =  " SELECT * WHERE  { ?s ?p ?o } ";	
		
		Query query = QueryFactory.create(queryString);		
		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		try {
			ResultSetRewindable results = ResultSetFactory.makeRewindable(qexec.execSelect());
			System.out.println("---- Text ----");
			ResultSetFormatter.out(System.out, results);
			results.reset();
		} finally {
			qexec.close();
		}
	}
}
