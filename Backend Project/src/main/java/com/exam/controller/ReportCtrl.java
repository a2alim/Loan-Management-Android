package com.exam.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exam.jasperreports.SimpleReportExporter;
import com.exam.jasperreports.SimpleReportFiller;
import com.exam.service.UserInfoService;
@RestController
public class ReportCtrl{
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private SimpleReportFiller simpleReportFiller;
	
	@Autowired
	UserInfoService userInfoService;
	
	@GetMapping("/user-report")
	public String pdf(HttpServletResponse response) {
		response.setContentType("application/pdf");
		try {
			SimpleReportExporter simpleExporter = new SimpleReportExporter();

			simpleReportFiller.setReportFileName("userreport2.jrxml");
			simpleReportFiller.compileReport();

			Map<String, Object> parameters = new HashMap<>();

			simpleReportFiller.setParameters(parameters);
			simpleReportFiller.fillReport();
			simpleExporter.setJasperPrint(simpleReportFiller.getJasperPrint());

			simpleExporter.exportToPdf("userreport2.pdf", "olonsoft");

			File file = new File("src/main/resources/reports/userreport2.pdf");
			response.setHeader("Content-Type", servletContext.getMimeType(file.getName()));
			response.setHeader("Content-Length", String.valueOf(file.length()));
			response.setHeader("Content-Disposition", "inline; filename=\"userreport2.pdf\"");
			Files.copy(file.toPath(), response.getOutputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@PostMapping("/user-report-byId")
	public String pdfRport(HttpServletResponse response, HttpServletRequest request) {
		response.setContentType("application/pdf");
		String id = request.getParameter("userId");
		Long uid = Long.parseLong(id);
		System.out.println(uid+"::::::::::::::::::::::::::::::ok::::::::::::::::::::::::::::");
		try {
			SimpleReportExporter simpleExporter = new SimpleReportExporter();

			simpleReportFiller.setReportFileName("userreportbyid.jrxml");
			simpleReportFiller.compileReport();

			Map<String, Object> parameters = new HashMap<>();
			parameters.put("userId", uid);

			simpleReportFiller.setParameters(parameters);
			simpleReportFiller.fillReport();
			simpleExporter.setJasperPrint(simpleReportFiller.getJasperPrint());

			simpleExporter.exportToPdf("userreportbyid.pdf", "olonsoft");

			File file = new File("src/main/resources/reports/userreportbyid.pdf");
			response.setHeader("Content-Type", servletContext.getMimeType(file.getName()));
			response.setHeader("Content-Length", String.valueOf(file.length()));
			response.setHeader("Content-Disposition", "inline; filename=\"userreportbyid.pdf\"");
			Files.copy(file.toPath(), response.getOutputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/user-report-byUsernmae")
	public String userReportByUsername(HttpServletResponse response, HttpServletRequest request) {
		response.setContentType("application/pdf");
		String username = request.getParameter("username");
		System.out.println(username+"::::::::::::::::::::::::::::::ok::::::::::::::::::::::::::::");
		try {
			SimpleReportExporter simpleExporter = new SimpleReportExporter();

			simpleReportFiller.setReportFileName("userreportbyusername.jrxml");
			simpleReportFiller.compileReport();

			Map<String, Object> parameters = new HashMap<>();
			parameters.put("username", username);

			simpleReportFiller.setParameters(parameters);
			simpleReportFiller.fillReport();
			simpleExporter.setJasperPrint(simpleReportFiller.getJasperPrint());

			simpleExporter.exportToPdf("userreportbyusername.pdf", "olonsoft");

			File file = new File("src/main/resources/reports/userreportbyusername.pdf");
			response.setHeader("Content-Type", servletContext.getMimeType(file.getName()));
			response.setHeader("Content-Length", String.valueOf(file.length()));
			response.setHeader("Content-Disposition", "inline; filename=\"userreportbyusername.pdf\"");
			Files.copy(file.toPath(), response.getOutputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	@GetMapping("/loan-report")
	public String loanReport(HttpServletResponse response) {
		response.setContentType("application/pdf");
		try {
			SimpleReportExporter simpleExporter = new SimpleReportExporter();

			simpleReportFiller.setReportFileName("totalLoan.jrxml");
			simpleReportFiller.compileReport();

			Map<String, Object> parameters = new HashMap<>();

			simpleReportFiller.setParameters(parameters);
			simpleReportFiller.fillReport();
			simpleExporter.setJasperPrint(simpleReportFiller.getJasperPrint());

			simpleExporter.exportToPdf("totalLoan.pdf", "olonsoft");

			File file = new File("src/main/resources/reports/totalLoan.pdf");
			response.setHeader("Content-Type", servletContext.getMimeType(file.getName()));
			response.setHeader("Content-Length", String.valueOf(file.length()));
			response.setHeader("Content-Disposition", "inline; filename=\"totalLoan.pdf\"");
			Files.copy(file.toPath(), response.getOutputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/loan-report-byId")
	public String loanReportById(HttpServletResponse response, HttpServletRequest request) {
		response.setContentType("application/pdf");
		String id = request.getParameter("loanId");
		Long lid = Long.parseLong(id);
		System.out.println(lid+"::::::::::::::::::::::::::::::LOan by id ::::::::::::::::::::::::::::");
		try {
			SimpleReportExporter simpleExporter = new SimpleReportExporter();

			simpleReportFiller.setReportFileName("loanbyid.jrxml");
			simpleReportFiller.compileReport();

			Map<String, Object> parameters = new HashMap<>();
			parameters.put("loanId", lid);

			simpleReportFiller.setParameters(parameters);
			simpleReportFiller.fillReport();
			simpleExporter.setJasperPrint(simpleReportFiller.getJasperPrint());

			simpleExporter.exportToPdf("loanbyid.pdf", "olonsoft");

			File file = new File("src/main/resources/reports/loanbyid.pdf");
			response.setHeader("Content-Type", servletContext.getMimeType(file.getName()));
			response.setHeader("Content-Length", String.valueOf(file.length()));
			response.setHeader("Content-Disposition", "inline; filename=\"loanbyid.pdf\"");
			Files.copy(file.toPath(), response.getOutputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/loan-report-byUsernmae")
	public String loanReportByUsername(HttpServletResponse response, HttpServletRequest request) {
		response.setContentType("application/pdf");
		String username = request.getParameter("username");
		System.out.println(username+"::::::::::::::::::::::::::::::Loan username ok::::::::::::::::::::::::::::");
		try {
			SimpleReportExporter simpleExporter = new SimpleReportExporter();

			simpleReportFiller.setReportFileName("loanbyusername.jrxml");
			simpleReportFiller.compileReport();

			Map<String, Object> parameters = new HashMap<>();
			parameters.put("username", username);

			simpleReportFiller.setParameters(parameters);
			simpleReportFiller.fillReport();
			simpleExporter.setJasperPrint(simpleReportFiller.getJasperPrint());

			simpleExporter.exportToPdf("loanbyusername.pdf", "olonsoft");

			File file = new File("src/main/resources/reports/loanbyusername.pdf");
			response.setHeader("Content-Type", servletContext.getMimeType(file.getName()));
			response.setHeader("Content-Length", String.valueOf(file.length()));
			response.setHeader("Content-Disposition", "inline; filename=\"loanbyusername.pdf\"");
			Files.copy(file.toPath(), response.getOutputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@GetMapping("/mail-report")
	public String mailpdf(HttpServletResponse response) {
		response.setContentType("application/pdf");
		try {
			SimpleReportExporter simpleExporter = new SimpleReportExporter();

			simpleReportFiller.setReportFileName("mailreport.jrxml");
			simpleReportFiller.compileReport();

			Map<String, Object> parameters = new HashMap<>();

			simpleReportFiller.setParameters(parameters);
			simpleReportFiller.fillReport();
			simpleExporter.setJasperPrint(simpleReportFiller.getJasperPrint());

			simpleExporter.exportToPdf("mailreport.pdf", "olonsoft");

			File file = new File("src/main/resources/reports/mailreport.pdf");
			response.setHeader("Content-Type", servletContext.getMimeType(file.getName()));
			response.setHeader("Content-Length", String.valueOf(file.length()));
			response.setHeader("Content-Disposition", "inline; filename=\"mailreport.pdf\"");
			Files.copy(file.toPath(), response.getOutputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@PostMapping("/installment-report-byloanId")
	public String installmentRport(HttpServletResponse response, HttpServletRequest request) {
		response.setContentType("application/pdf");
		String id = request.getParameter("loanId");
		Long uid = Long.parseLong(id);
		System.out.println(uid+"::::::::::::::::::::::::::::::loan id for instalment ok::::::::::::::::::::::::::::");
		try {
			SimpleReportExporter simpleExporter = new SimpleReportExporter();

			simpleReportFiller.setReportFileName("instllmentbyloanid.jrxml");
			simpleReportFiller.compileReport();

			Map<String, Object> parameters = new HashMap<>();
			parameters.put("loanId", uid);

			simpleReportFiller.setParameters(parameters);
			simpleReportFiller.fillReport();
			simpleExporter.setJasperPrint(simpleReportFiller.getJasperPrint());

			simpleExporter.exportToPdf("instllmentbyloanid.pdf", "olonsoft");

			File file = new File("src/main/resources/reports/instllmentbyloanid.pdf");
			response.setHeader("Content-Type", servletContext.getMimeType(file.getName()));
			response.setHeader("Content-Length", String.valueOf(file.length()));
			response.setHeader("Content-Disposition", "inline; filename=\"instllmentbyloanid.pdf\"");
			Files.copy(file.toPath(), response.getOutputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@PostMapping("/installment-report-byUsernmae")
	public String installmentReportByUsername(HttpServletResponse response, HttpServletRequest request) {
		response.setContentType("application/pdf");
		String username = request.getParameter("username");
		System.out.println(username+"::::::::::::::::::::::::::::::ok::::::::::::::::::::::::::::");
		try {
			SimpleReportExporter simpleExporter = new SimpleReportExporter();

			simpleReportFiller.setReportFileName("instllmentbyusername.jrxml");
			simpleReportFiller.compileReport();

			Map<String, Object> parameters = new HashMap<>();
			parameters.put("username", username);

			simpleReportFiller.setParameters(parameters);
			simpleReportFiller.fillReport();
			simpleExporter.setJasperPrint(simpleReportFiller.getJasperPrint());

			simpleExporter.exportToPdf("instllmentbyusername.pdf", "olonsoft");

			File file = new File("src/main/resources/reports/instllmentbyusername.pdf");
			response.setHeader("Content-Type", servletContext.getMimeType(file.getName()));
			response.setHeader("Content-Length", String.valueOf(file.length()));
			response.setHeader("Content-Disposition", "inline; filename=\"instllmentbyusername.pdf\"");
			Files.copy(file.toPath(), response.getOutputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
