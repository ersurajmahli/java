package com.vm.expenum;

public class PlayWithEnum {

	public static void main(String[] args) {
		String personName = "Suraj";
		BirthMonth personBirthMonthShort = BirthMonth.AUGUST;
		BirthMonth personBirthMonthFull = BirthMonth.AUGUST;
		System.out.println("person name: "+personName+", short birth month name: "+personBirthMonthShort.shortName);
		System.out.println("person name: "+personName+", full birth month name: "+personBirthMonthFull.fullName);
	}

	private enum BirthMonth {
		JANUARY("January","JAN"),
		FEBRUARY("Feburary","FEB"),
		MARCH("March","MAR"),
		APRIL("pril","APR"),
		MAY("May","MAY"),
		JUNE("June","JUN"),
		JULY("July","JUL"),
		AUGUST("August","AUG"),
		SEPTEMBER("September","SEP"),
		OCTOBER("October","OCT"),
		NOVEMBER("November","NOV"),
		DECEMBER("December","DEC");
		
		private String fullName;
		private String shortName;
		private BirthMonth(String fullName, String shortName) {
			this.fullName=fullName;
			this.shortName=shortName;
		}
		
		public String getFullName() {
			return fullName;
		}
		public String getShortName() {
			return shortName;
		}
	}

}
