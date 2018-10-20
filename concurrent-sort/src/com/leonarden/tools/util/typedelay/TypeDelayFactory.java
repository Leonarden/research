package com.leonarden.tools.util.typedelay;

public class TypeDelayFactory {

	public static final long ByteDelayUnit = 20;
	public static final long IntegerDelayUnit = 15;
	public static final long LongDelayUnit = 10;
	public static final long FloatDelayUnit = 5;
	public static final long DoubleDelayUnit = 2;
	
		
	
	public  TypeDelay getInstance(Object item) throws Exception{
		TypeDelay  itemTypeDelay = null;
		long du = 0;
		try{
		
			if(item instanceof Byte){
			   du = ByteDelayUnit;
				/*itemTypeDelay = new ByteTypeDelay();*/
			}else if( item instanceof Integer){
				du = IntegerDelayUnit;
				itemTypeDelay = new IntegerTypeDelay((Integer) item, du);

			}else if (item instanceof Long) {
				du = LongDelayUnit;
				
			}else if(item instanceof Float){
				du = FloatDelayUnit;
			}else if(item instanceof Double){
				du = DoubleDelayUnit;
			
			}else
				throw new Exception("Type not accepted");
		}catch(Exception ex){
			ex.printStackTrace();	
		}
				
			return itemTypeDelay;
		
	}
        
	
		public  TypeDelay getInstance(Object item, long delayUnit) throws Exception{
			TypeDelay  itemTypeDelay = null;
			long du = delayUnit;
			try{
			
				if(item instanceof Byte){
				   /*itemTypeDelay = new ByteTypeDelay();*/
				}else if( item instanceof Integer){
				
					itemTypeDelay = new IntegerTypeDelay((Integer) item, du);

				}else if (item instanceof Long) {
					
				}else if(item instanceof Float){
					
				}else
					throw new Exception("Type not accepted");
			}catch(Exception ex){
				ex.printStackTrace();	
			}
					
				return itemTypeDelay;
			
		}
	

	
}
