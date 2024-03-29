package stepdefinitions;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ForReport {
	public static void JVMReport(String json) {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");

		Configuration con = new Configuration(f, "facebook");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Operating system", "Windows");
		con.addClassifications("Sprint", "21");
		List<String> jsonfiles = new LinkedList<String>();
		jsonfiles.add(json);

		ReportBuilder r = new ReportBuilder(jsonfiles, con);
		r.generateReports();
	}


}
