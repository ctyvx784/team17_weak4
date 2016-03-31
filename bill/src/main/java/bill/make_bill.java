public class make_bill {
   String plan;
   int line,usage;
   plan planinfo;
   public make_bill(){
      
   }
   public make_bill(String plan,int line,int usage){
      this.plan=plan;
      this.line=line;
      this.usage=usage;
      if("Gold".equals(plan) ||"gold".equals("plan") ){
         planinfo=new plan_gold();
      }
      else if("Silver".equals(plan) ||"silver".equals(plan)){
         planinfo=new plan_silver();
      }
   }
   public double getbasicbill(){
      return planinfo.get_basic_cost();
   }
   public double familiy_discount(){
      return (line-2)*planinfo.get_family_discountcost();
   }
   public double linebill(){
      
         if(line>3){
            return planinfo.get_additional_line_cost()*2+familiy_discount();
         }
         else{
            return planinfo.get_additional_line_cost()*(line-1);
         }
   }
   public double overchargebill(){
      
      if(usage>1000){
         return (usage-1000)*planinfo.get_overcharge_cost();
      } else{
         return 0;
      }

   }
   public double totalbill(){
      return getbasicbill()+linebill()+overchargebill();
   }
}
