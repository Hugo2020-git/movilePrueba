package reportHtml;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @autor : eynar.pari
 * @date : 25/09/2020.
 **/
public class ReportGenerator {

    public static void main(String[]args){
        String path="D:\\DOCUMENTOS\\DIPLOMADO_TESTING_UCB\\LECCIONES\\4_AUTOMATIZACION_MOVIL\\UCBRepositorios\\movile\\build\\reports\\cucumber\\";

        File reportOutPut= new File(path+"finalReport");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(path+"report.json");

        Configuration configuration =  new Configuration(reportOutPut,"UCB Diplomado");
        configuration.setBuildNumber("v50.0");
        configuration.addClassifications("SO","Windows");
        configuration.addClassifications("Owner","Eynar");
        configuration.addClassifications("Branch","cucumber");
        configuration.addClassifications("Type Report","Local");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
        reportBuilder.generateReports();
    }
}
