package LeThiNgocNhu;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.sparql.vocabulary.FOAF;
import org.apache.jena.vocabulary.DC;
import org.apache.jena.vocabulary.VCARD;

public class BaiThi {
	static Model creaModel() {
		//1. Tạo một model
		Model model=ModelFactory.createDefaultModel();

		//2. Tạo ra resource trong model
		String ngocnhuIRI="http://le.thi.ngoc.nhu/foaf.rdf#";
		Resource ngocnhu=model.createResource(ngocnhuIRI);
		
		String lamViecTaiIRI="http://semanticweb-lear/lamViecTai";
		Property lamViecTai=model.createProperty(lamViecTaiIRI);
		Resource truongDHKH=model.createResource("http://semanticweb-lear/dhkh");
		
		String subjectIRI="http://semanticweb-lear/HSV";
		Property subject=model.createProperty(subjectIRI);
		model.createResource("http://semanticweb-lear/HoiSinhVien").
				addProperty(subject,model.createResource( "http://purl.org/dc/elements/1.0/BanHoatDong").
						addProperty(VCARD.FN, model.createResource("http://www.w3.org/2006/vcard/ns#HoBaoAn").
								addProperty(VCARD.NAME, "Hồ Bảo An").
								addProperty(DC.description, "Chức vụ: Trưởng ban").
								addProperty(VCARD.ADR, "Quảng An, Huế")).
						addProperty(VCARD.FN, model.createResource("http://www.w3.org/2006/vcard/ns#NguyenVanNam").
								addProperty(VCARD.NAME, "Nguyễn Văn Nam").
								addProperty(DC.description, "Chức vụ: Phó ban").
								addProperty(VCARD.ADR, "Phú Lộc, Huế"))).
				addProperty(subject, model.createResource("http://purl.org/dc/elements/1.0/BanTruyenThong").
						addProperty(VCARD.FN, model.createResource("http://www.w3.org/2006/vcard/ns#TranThiMyLinh").
								addProperty(VCARD.NAME, "Trần Thị Mỹ Linh").
								addProperty(DC.description, "Chức vụ: Trưởng ban").
								addProperty(VCARD.ADR, "Phú Vang, Huế")).
						addProperty(VCARD.FN, model.createResource("http://www.w3.org/2006/vcard/ns#LeHongHanh").
								addProperty(VCARD.NAME, "Lê Hồng Hạnh").
								addProperty(DC.description, "Chức vụ: Phó ban").
								addProperty(VCARD.ADR, "Quảng An, Huế")).
						addProperty(VCARD.FN, model.createResource("http://www.w3.org/2006/vcard/ns#TranBao").
								addProperty(VCARD.NAME, "Trần Bảo").
								addProperty(DC.description, "Thành viên").
								addProperty(VCARD.ADR, "Lê Lợi, Huế"))
						);
		//3. Bổ sung statement cho resource
		
		
		ngocnhu.addProperty(lamViecTai, truongDHKH);
		ngocnhu.addProperty(VCARD.ADR, "Quảng Thọ, Huế");
		ngocnhu.addProperty( VCARD.EMAIL,"ngocnhu04032000@gmail.com");
		ngocnhu.addProperty(DC.type, FOAF.Person);
		ngocnhu.addProperty(FOAF.based_near,model.createResource("http://purl.org/dc/elements/1.0/BanHoatDong"));
		return model;
	}

	static void createAndPrintModel() {
		Model model =creaModel();
		// In nội dung của model dưới dạng mặc định (XML-RDF)
		model.write(System.out);
	}
	public static void main(String[] args) {
		// ví dụ 1
		createAndPrintModel();
		
	}
}
