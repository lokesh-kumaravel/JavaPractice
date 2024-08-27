import java.util.*;
public class Distinct {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      s.nextLine();
      LinkedHashSet<String> l = new LinkedHashSet<String>();
      for(int i = 0;i<n;i++)
      {
        String k = s.nextLine();
        l.add(k);
      }
      int a  =s.nextInt();
      int o=0;
      for (String f : l) {
        o++;
        if(o==a)
        {
            System.out.println(f);
            break;
        }
    }
    s.close();
    }
}