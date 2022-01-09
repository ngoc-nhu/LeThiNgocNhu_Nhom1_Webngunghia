package LeThiNgocNhu;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.util.FileManager;

import com.sun.tools.javac.Main;

public class truyvan {
	//Truy vấn theo tên, địa chỉ
//	public static void main(String[] args) {
//		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//		Model model=FileManager.get().loadModel("C:/Users/18t10/eclipse-workspace/web/dulieungocnhu.rdf");
//		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//				+ "PREFIX dc:<http://purl.org/dc/elements/1.1/>"
//				+ "PREFIX j.0:<http://semanticweb-lear/>"
//				+ "PREFIX j.1:<http://xmlns.com/foaf/0.1/>"
//				+ " SELECT * WHERE  {"
//				+ "?FN vcard:NAME ?x." //Truy vấn tên
//				//+ "?FN vcard:ADR ?x." //truy vấn địa chỉ
//				//+ "?FN rdf:predicate ?x."
//				+ " } ";
//		Query query=QueryFactory.create(queryString);
//		QueryExecution qexec= QueryExecutionFactory.create(query, model);
//		try {
//			ResultSet results=qexec.execSelect();
//			while (results.hasNext()) {
//				QuerySolution soln=results.nextSolution();
//				Literal name=soln.getLiteral("x");
//				System.out.println(name);
//				System.out.println("--------------------------------");
//			}
//		} finally {
//			qexec.close();
//		}
//	}
	
			//Truy vấn theo bộ đôi
//	public static void main(String[] args) {
//		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//		Model model=FileManager.get().loadModel("C:/Users/18t10/eclipse-workspace/web/dulieungocnhu.rdf");
//		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//				+ "PREFIX dc:<http://purl.org/dc/elements/1.1/>"
//				+ "PREFIX j.0:<http://semanticweb-lear/>"
//				+ "PREFIX j.1:<http://xmlns.com/foaf/0.1/>"
//				+ " SELECT * WHERE  {"
//				+ "?FN vcard:NAME ?x." 
//				+ "?FN vcard:ADR ?y." 
//				+ " } ";
//		Query query=QueryFactory.create(queryString);
//		QueryExecution qexec= QueryExecutionFactory.create(query, model);
//		try {
//			ResultSet results=qexec.execSelect();
//			while (results.hasNext()) {
//				QuerySolution soln=results.nextSolution();
//				Literal name=soln.getLiteral("x");
//				Literal name1=soln.getLiteral("y");
//				System.out.println("Tên thành viên: "+name);
//				System.out.println("Địa chỉ: "+name1);
//				System.out.println("-------------------------------");
//			}
//		} finally {
//			qexec.close();
//		}
//	}
	
				// Tìm tên, địa chỉ theo tên thành viên
//	public static void main(String[] args) {
//		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//		Model model=FileManager.get().loadModel("C:/Users/18t10/eclipse-workspace/web/dulieungocnhu.rdf");
//		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//				+ "PREFIX dc:<http://purl.org/dc/elements/1.1/>"
//				+ "PREFIX j.0:<http://semanticweb-lear/>"
//				+ "PREFIX j.1:<http://xmlns.com/foaf/0.1/>"
//				+ " SELECT * WHERE  {"
//				+ "?FN vcard:NAME ?x."
//				+ "?FN vcard:ADR ?y."
//				+ "FILTER(?x =\"Hồ Bảo An\")" 
//				+ " } ";
//		Query query=QueryFactory.create(queryString);
//		QueryExecution qexec= QueryExecutionFactory.create(query, model);
//		try {
//			ResultSet results=qexec.execSelect();
//			while (results.hasNext()) {
//				QuerySolution soln=results.nextSolution();
//				Literal name=soln.getLiteral("x");
//				Literal name1=soln.getLiteral("y");
//				System.out.println("Tên thành viên: "+name);
//				System.out.println("Địa chỉ: "+name1);
//				System.out.println("-------------------------------");
//			}
//		} finally {
//			qexec.close();
//		}
//	}
	
				// tìm tên địa chỉ, tên theo địa chỉ
//	public static void main(String[] args) {
//		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//		Model model=FileManager.get().loadModel("C:/Users/18t10/eclipse-workspace/web/dulieungocnhu.rdf");
//		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//				+ "PREFIX dc:<http://purl.org/dc/elements/1.1/>"
//				+ "PREFIX j.0:<http://semanticweb-lear/>"
//				+ "PREFIX j.1:<http://xmlns.com/foaf/0.1/>"
//				+ " SELECT * WHERE  {"
//				+ "?FN vcard:NAME ?x."
//				+ "?FN vcard:ADR ?y."
//				+ "?FN dc:description ?z."
//				+ "FILTER(?y =\"Quảng An, Huế\")" 
//				+ " } ";
//		Query query=QueryFactory.create(queryString);
//		QueryExecution qexec= QueryExecutionFactory.create(query, model);
//		try {
//			ResultSet results=qexec.execSelect();
//			while (results.hasNext()) {
//				QuerySolution soln=results.nextSolution();
//				Literal name=soln.getLiteral("x");
//				Literal name1=soln.getLiteral("y");
//				Literal name2=soln.getLiteral("z");
//				System.out.println("Tên thành viên: "+name);
//				System.out.println("Địa chỉ: "+name1);
//				System.out.println(name2);
//				System.out.println("-----------------------");
//			}
//		} finally {
//			qexec.close();
//		}
//	}
			// tìm kiếm thành viên theo theo chức vụ
	public static void main(String[] args) {
		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
		Model model=FileManager.get().loadModel("C:/Users/18t10/eclipse-workspace/web/dulieungocnhu.rdf");
		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
				+ "PREFIX dc:<http://purl.org/dc/elements/1.1/>"
				+ "PREFIX j.0:<http://semanticweb-lear/>"
				+ "PREFIX j.1:<http://xmlns.com/foaf/0.1/>"
				+ " SELECT * WHERE  {"
				+ "?FN vcard:NAME ?x."
				+ "?FN vcard:ADR ?y."
				+ "?FN dc:description ?z." 
				+ "FILTER(?z =\"Chức vụ: Trưởng ban\")" 
				+ " } ";
		Query query=QueryFactory.create(queryString);
		QueryExecution qexec= QueryExecutionFactory.create(query, model);
		try {
			ResultSet results=qexec.execSelect();
			while (results.hasNext()) {
				QuerySolution soln=results.nextSolution();
				Literal name=soln.getLiteral("x");
				Literal name1=soln.getLiteral("y");
				System.out.println("Tên thành viên: "+name);
				System.out.println("Địa chỉ: "+name1);
			}
		} finally {
			qexec.close();
		}
	}
		// tìm người sử dụng email
}
