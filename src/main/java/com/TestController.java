package com;

import com.Integral;
import com.IntegralRequest;
import com.IntegralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.LocalDateTime;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

	@Autowired
	IntegralRepository integralRepository;

	@GetMapping("/integral")
	public ResponseEntity<?> integral(@Valid @RequestBody HttpServletRequest httpReq, IntegralRequest integralRequest) {

		Integral integral = new Integral(integralRequest.getCode());

		float result = Simpson(integralRequest.A,integralRequest.h,integralRequest.B);

		LocalDateTime dateTime = LocalDateTime.now();

		integral.setDate(dateTime);

		integral.setIp(httpReq.getRemoteAddr());

		integralRepository.save(integral);

		return ResponseEntity.ok(result);
	}

	float f (float x) { //Функция, интеграл от которой берется
		return (float) ( x * 2.718 - x);
	}

	float Trap (float A,float h,float B) { //Метод трапеций
		float x,s;
		s=(f(A)+f(B))/2;
		for (x=A+h; x<B; x+=h) {
			s+=f(x);
		}
		return s*h;
	}

	float Simpson (float A,float h,float B) { //Метод Симпсона
		float x,s;
		int i,n;
		n= (int) ((B-A)/h);
		s=(f(A)+f(B))/2+2*f(A+h/2);
		x=A;
		for (i=0; i<n-1; i++) {
			x+=h;
			s+=(2*f(x+h/2)+f(x));
		}
		return s*h/3;
	}


}
