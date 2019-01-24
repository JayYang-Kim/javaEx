import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil{
	/**
	 * String형 날짜를 Date형으로 변환하는 메소드
	 * 
	 * @param strDate 변환할 날짜
	 * @return 날짜
	 */
	public Date toDate(String strDate) {
		Date date=null;
		
		try {
			if (strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}

			strDate = strDate.replaceAll("(\\-|\\.|/)", "");
			
			SimpleDateFormat sformat = new SimpleDateFormat("yyyyMMdd");
			date = sformat.parse(strDate);
			
		} catch (ParseException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return date;
	}

	/**
	 * Date형을 String형으로 변환하는 메소드
	 * 
	 * @param date 변환할 날짜
	 * @return 변환된 문자열
	 */
	public String toString(Date date) {
		String str=null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        str = sdf.format(date);
		
		return str;
	}
	
	/**
	 * 나이를 구하는 메소드 
	 * @param strDate
	 * @return 나이
	*/
	public int toAge(String strDate) {
		int age=0;
		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length()==10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
			int year=Integer.parseInt(strDate.substring(0, 4));
			int month=Integer.parseInt(strDate.substring(4, 6));
			int day=Integer.parseInt(strDate.substring(6));
			
			Calendar cal= Calendar.getInstance ();
		    cal.set(Calendar.YEAR, year);
		    cal.set(Calendar.MONTH, month-1);
		    cal.set(Calendar.DATE, day);
		    
		    Calendar now = Calendar.getInstance ();
		    
		    age = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
		    if ( (cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
		            || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) 
		              && cal.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
		        age--;
		    }
		    
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

		return age;
	}
	
	/**
	 * 윤년인지를 구하는 메소드
	 * @param strDate
	 * @return 윤년이면 true를 리턴
	 */
	public boolean isLeapYear(String strDate) {
		boolean b=false;
		
		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length()==10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
			int year=Integer.parseInt(strDate.substring(0, 4));
			
			b = isLeapYear(year);
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

		return b;
	}

	/**
	 * 윤년인지를 구하는 메소드
	 * @param year
	 * @return 윤년이면 true를 리턴
	 */
	public boolean isLeapYear(int year) {
		return year%4==0&&year%100!=0||year%400==0;
	}
	
	/**
	 * 두 날짜 사이의 차이(일자)를 구하는 메소드
	 * @param startDate
	 * @param endDate
	 * @return 날짜 차이(일자)
	 */
	public int toDiffDays(String startDate, String endDate) {
		int dif=0;
		
		try {
			if((startDate.length() != 8 && startDate.length()!=10) ||
				(endDate.length() != 8 && endDate.length()!=10)) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd)");
			}
			
			if(startDate.length()==10) {
				startDate= startDate.replaceAll("\\-|\\.|/","");
			}
			if(endDate.length()==10) {
				endDate= endDate.replaceAll("\\-|\\.|/","");
			}
			
			SimpleDateFormat sformat = new SimpleDateFormat("yyyyMMdd");
            Date begin = sformat.parse(startDate);
    		Date end = sformat.parse(endDate);
    		dif= (int)((end.getTime() - begin.getTime()) / (24 * 60 * 60* 1000));
    		
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd)");
		}

		return dif;
	}
	
	/**
	 * 기준날짜의 며칠째 되는 날을 구하는 메소드
	 * @param strDate 기준날짜
	 * @param days 며칠째 되는 날을 계산할 일자
	 * @return 며칠후의 날짜(yyyyMMdd)
	 */
	public String toDaysLater(String strDate, int days) {
		String result = "";
		try {
			if((strDate.length() != 8 && strDate.length() != 10)) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length()==10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}

			int year = Integer.parseInt(strDate.substring(0,4));
			int month = Integer.parseInt(strDate.substring(4,6));
			int day = Integer.parseInt(strDate.substring(6,8));
			
			Calendar cal = Calendar.getInstance();
			cal.set(year, month-1, day);
			cal.add(Calendar.DATE, days);
			
			year = cal.get(Calendar.YEAR);
			month = cal.get(Calendar.MONTH)+1;
			day = cal.get(Calendar.DATE);
			
			result = String.format("%4d%02d%02d", year, month, day) ;
    		
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): "+strDate);
		}
		
		return result;
	}
	
	/**
	 * 한 주의 시작일(일요일)을 구하는 메소드
	 * @param strDate
	 * @return 한 주의 시작일자(yyyyMMdd)
	 */
	public String toWeekStart(String strDate) {
		String s="";
		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length() == 10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
			int year = Integer.parseInt(strDate.substring(0, 4));
			int month = Integer.parseInt(strDate.substring(4, 6));
			int day = Integer.parseInt(strDate.substring(6));
			
			Calendar cal = Calendar.getInstance ();
		    cal.set(Calendar.YEAR, year);
		    cal.set(Calendar.MONTH, month-1);
		    cal.set(Calendar.DATE, day);
		    
		    Calendar sday = (Calendar)cal.clone();
			int t = cal.get(Calendar.DAY_OF_WEEK) - 1;
			sday.add(Calendar.DAY_OF_MONTH, t*-1);
		    
			year = sday.get(Calendar.YEAR);
			month = sday.get(Calendar.MONTH)+1;
			day = sday.get(Calendar.DATE);
			
			s = String.format("%4d%02d%02d", year, month, day) ;
			
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

		return s;
	}
	
	/**
	 * 한 주의 마지막일(토요일)을 구하는 메소드
	 * @param strDate
	 * @return 한 주의 마지막일자(yyyyMMdd)
	 */
	public String toWeekEnd(String strDate) {
		String s="";
		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length() == 10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
			int year = Integer.parseInt(strDate.substring(0, 4));
			int month = Integer.parseInt(strDate.substring(4, 6));
			int day = Integer.parseInt(strDate.substring(6));
			
			Calendar cal = Calendar.getInstance ();
		    cal.set(Calendar.YEAR, year);
		    cal.set(Calendar.MONTH, month-1);
		    cal.set(Calendar.DATE, day);
		    
		    Calendar eday = (Calendar)cal.clone();
			int t = 7 - cal.get(Calendar.DAY_OF_WEEK);
			eday.add(Calendar.DAY_OF_MONTH, t);
		    
			year = eday.get(Calendar.YEAR);
			month = eday.get(Calendar.MONTH)+1;
			day = eday.get(Calendar.DATE);
			
			s = String.format("%4d%02d%02d", year, month, day) ;
			
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

		return s;
	}
	
	/**
	 * 특정날짜의 다음날짜를 구하는 메소드
	 * @param strDate 다음날짜를 구할 날짜
	 * @return 특정날짜의 다음날짜 리턴 (yyyyMMdd)
	 */
    public String afterDays(String strDate) {
        String date = "";
        
        try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length() == 10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
	        
	        Calendar cal = Calendar.getInstance();
	        cal.set(Integer.parseInt(strDate.substring(0,4)), Integer.parseInt(strDate.substring(4,6))-1, Integer.parseInt(strDate.substring(6,8)));

	        cal.add(Calendar.DATE, +1);

	        SimpleDateFormat formatter = new SimpleDateFormat ("yyyyMMdd", Locale.KOREA);
	        date = formatter.format (cal.getTime());
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}        

         return date;
    }

    /**
     * 특정날짜의 이전날짜를 구하는 메소드
     * @param strDate 이전날짜를 구할 날짜
     * @return 특정날짜의 이전날짜 리턴 (yyyyMMdd)
     */
    public String preDays(String strDate) {
        String date = "";

		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length() == 10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
	        Calendar cal = Calendar.getInstance();

	        cal.set(Integer.parseInt(strDate.substring(0,4)), Integer.parseInt(strDate.substring(4,6))-1, Integer.parseInt(strDate.substring(6,8)));
	        cal.add(Calendar.DATE, -1);

	        SimpleDateFormat formatter = new SimpleDateFormat ("yyyyMMdd", Locale.KOREA );
	        date = formatter.format (cal.getTime());
			
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

        return date;
    }
    
    /**
     * 해당년도의 띠를 구하는 메소드
     * @param strDate
     * @return
     */
    public String toTti(String strDate) {
		String s="";
		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length() == 10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
			int year = Integer.parseInt(strDate.substring(0, 4));
			s = toTti(year);
			
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

		return s;
    }
    
    /**
     * 해당년도의 띠를 구하는 메소드
     * @param year
     * @return
     */
    public String toTti(int year) {
		String t[] = {"원숭이", "닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
    	return t[year%12];
    }

	/**
	 * 날짜가 올바른 형식인지를 리턴하는 메소드(올바르면 true)
	 * 
	 * @param date  형식을 알어볼 날짜
	 * @return      
	 */
	public boolean isDateCheck(String date) {
		try {
			if (date.length() != 8 && date.length() != 10) {
				return false;
			}

			date = date.replaceAll("(\\-|\\.|/)", "");
			int year = Integer.parseInt(date.substring(0, 4));
			int month = Integer.parseInt(date.substring(4, 6));
			int day = Integer.parseInt(date.substring(6));
			
			if(month<1||month>12)
				return false;
			
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month - 1);
			
			int lastDay=cal.getActualMaximum(Calendar.DATE);
			if(day<1||day>lastDay)
				return false;

		} catch (Exception e) {
			return false;
		}

		return true;
	}
	
	/**
	 * 주민번호가 올바른 형식인지를 리턴하는 메소드(올바르면 true)
	 * 
	 * @param rrn  주민번호
	 * @return      
	 */
	public boolean isRrnCheck(String rrn) {
		int [] check = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int tot, n, lastNum, chkNum;
		boolean b=false;
		
		try {
			if (rrn.length() != 14 && rrn.length() != 13) {
				return false;
			}
			
			if(toBirth(rrn).length()==0) {
				return false;
			}

			rrn = rrn.replaceAll("-", "");

			tot=0;
			for(int i = 0; i < 12; i++) {
				n = Integer.parseInt(rrn.substring(i, i+1));

				tot = tot+(n * check[i]);
			}

			lastNum = Integer.parseInt(rrn.substring(12));
			chkNum = 11 - tot % 11;
			chkNum = chkNum % 10;
			
			b=lastNum == chkNum;
			
		} catch (Exception e) {
			return false;
		}

		return b;
	}
	
	/**
	 * 주민번호를 이용하여 생년월일을 리턴하는 메소드
	 * 
	 * @param rrn  주민번호
	 * @return     생년월일
	 */
	public String toBirth(String rrn) {
		String birth="";
		int gender;
		
		try {
			if (rrn.length() != 14 && rrn.length() != 13) {
				throw new IllegalArgumentException("Invalid rrn format: " + rrn);
			}
			
			rrn = rrn.replaceAll("-", "");
			gender=Integer.parseInt(rrn.substring(6,7));
			
			// birth=rrn.substring(0, 6);
			birth=rrn.substring(0, 2)+"-"+rrn.substring(2, 4)+"-"+rrn.substring(4, 6);
			if(gender==1||gender==2||gender==5||gender==6) {
				birth="19"+birth;
			} else if(gender==3||gender==4||gender==7||gender==8) {
				birth="20"+birth;
			} else if(gender==0||gender==9) {
				birth="18"+birth;
			}
			
			if(! isDateCheck(birth)) {
				throw new IllegalArgumentException("Invalid rrn format: " + rrn);
			}
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return birth;
	}
	
	/**
	 * 주민번호를 이용하여 성별을 리턴하는 메소드
	 * 
	 * @param rrn  주민번호
	 * @return     성별
	 */
	public String toGender(String rrn) {
		String gender="";
		int s;
		
		try {
			if (isRrnCheck(rrn)) {
				throw new IllegalArgumentException("Invalid rrn format: " + rrn);
			}
			
			rrn = rrn.replaceAll("-", "");
			s=Integer.parseInt(rrn.substring(6,7));
			
			gender="남자";
			if(s%2==0)
				gender="여자";
			
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return gender;
	}

}
