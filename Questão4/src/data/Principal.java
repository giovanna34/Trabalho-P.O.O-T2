package data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Date d = new Date ();
		SimpleDateFormat formato = new SimpleDateFormat("dd '/' MMMM '/' yyyy");
		SimpleDateFormat format = new SimpleDateFormat("HH':'mm");
		
		String HoraFormatada = format.format(d);
		String DataFormatada = formato.format(d);
		System.out.print("data atual: " + DataFormatada + "\nHora atual: " + HoraFormatada);
		}
				


	}

