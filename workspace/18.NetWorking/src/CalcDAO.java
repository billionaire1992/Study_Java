public class CalcDAO {
	//getResult() ▶ 전달받은 매개변수 (CalcDTO : num1 , num2, opcode) 를 이용하여
	//연산자(opcode)에 따른 사칙연산을 수행하고 결과를 리턴하는 메소드 정의 
	public double getResult(CalcDTO dto) {
		double result = 0;
		if(dto.getOpcode().equals("+")) {
			result = dto.getNum1() + dto.getNum2();
		}else if(dto.getOpcode().equals("-")) {
			result = dto.getNum1() - dto.getNum2();	
		}else if(dto.getOpcode().equals("*")) {
			result = dto.getNum1() * dto.getNum2();		
		}else {
			result = (double)dto.getNum1() / dto.getNum2();					
		}//if
		return result;
	}//getResult()
}//class
