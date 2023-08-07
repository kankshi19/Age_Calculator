import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class currentAge 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your date of birth (dd-mm-yyy)");
        String dob = sc.next().trim();
        int d1 = Integer.parseInt(dob.substring(0, 2));
        int m1 = Integer.parseInt(dob.substring(3, 5));
        int y1 = Integer.parseInt(dob.substring(6, 10));

        String pattern = "dd-MM-yyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        //System.out.println(date);
        String dd = date.substring(0, 2);
        int d2 = Integer.parseInt(dd);
        String mm = date.substring(3, 5);
        int m2 = Integer.parseInt(mm);
        String yy = date.substring(6, 10);
        int y2 = Integer.parseInt(yy);

        int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    
        if(d2<d1)
        {
            d2 = d2 + month[d2-1];
            m2--;
        }
        if(m2<m1)
        {
            m2 = m2 + 12;
            y2--;
        }
        
        int y = y2-y1;
        int m= m2-m1;
        int d=d2-d1;
        
        if(m==0&&d==0)
        {
            System.out.println("Heyy its your birthday! Wish u a very happy birthday!!!");
        }
        else
        {
            System.out.println("You are "+y+"years , "+m+"months and "+d+"days old today");
        }
    }
}

