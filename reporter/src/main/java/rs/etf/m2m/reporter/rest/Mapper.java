package rs.etf.m2m.reporter.rest;

import java.util.function.Function;

import rs.etf.m2m.reporter.models.Report;
import rs.etf.m2m.reporter.rest.beans.ReportRequest;

public class Mapper {

	public static Function<ReportRequest, Report> reportRequestToReport = new Function<ReportRequest, Report>() {
		public Report apply(ReportRequest request) {
			return Report.builder().comment(request.getComment()).latitude(request.getLatitude())
					.longitude(request.getLongitude()).photo(request.getPhoto()).build();
		}
	};

	public static Function<Report, ReportRequest> reportToReportRequest = new Function<Report, ReportRequest>() {
		public ReportRequest apply(Report request) {
			return ReportRequest.builder().comment(request.getComment()).latitude(request.getLatitude())
					.longitude(request.getLongitude()).photo(request.getPhoto())
					.dateTimeCreated(request.getDateTimeCreated()).build();
		}
	};
}
