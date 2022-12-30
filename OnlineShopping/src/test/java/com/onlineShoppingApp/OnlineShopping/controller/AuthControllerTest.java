package com.onlineShoppingApp.OnlineShopping.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.onlineShoppingApp.OnlineShopping.dto.AuthenticationResponse;
import com.onlineShoppingApp.OnlineShopping.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class AuthControllerTest {
    /**
     * Method under test: {@link AuthController#registerUser(User)}
     */
    @Test
    void testRegisterUser() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IncompatibleClassChangeError: Class org.mockito.Answers does not implement the requested interface org.mockito.stubbing.Answer
        //       at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:93)
        //       at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
        //       at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:38)
        //       at org.mockito.internal.creation.cglib.MethodInterceptorFilter.intercept(MethodInterceptorFilter.java:59)
        //       at com.onlineShoppingApp.OnlineShopping.service.UserService$$EnhancerByMockitoWithCGLIB$$536a96d8.createUser(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.AuthController.registerUser(AuthController.java:31)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:681)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        AuthController authController = new AuthController();

        User user = new User();
        user.setConfPassword("password");
        user.setContactNumber("42");
        user.setEmail("abc.sarkar@example.org");
        user.setFirstName("Sushmita");
        user.setId("42");
        user.setLastName("Sarkar");
        user.setPassword("password");
        user.setRole("Admin");
        user.setUserName("SushmitaAd");
        ResponseEntity<?> actualRegisterUserResult = authController.registerUser(user);
        assertTrue(actualRegisterUserResult.hasBody());
        assertTrue(actualRegisterUserResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualRegisterUserResult.getStatusCode());
        assertEquals("Issue occur", ((AuthenticationResponse) actualRegisterUserResult.getBody()).getResponse());
    }

    /**
     * Method under test: {@link AuthController#registerUser(User)}
     */
    @Test
    void testRegisterUser2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IncompatibleClassChangeError: Class org.mockito.Answers does not implement the requested interface org.mockito.stubbing.Answer
        //       at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:93)
        //       at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
        //       at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:38)
        //       at org.mockito.internal.creation.cglib.MethodInterceptorFilter.intercept(MethodInterceptorFilter.java:59)
        //       at com.onlineShoppingApp.OnlineShopping.service.UserService$$EnhancerByMockitoWithCGLIB$$536a96d8.createUser(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.AuthController.registerUser(AuthController.java:31)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:681)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        AuthController authController = new AuthController();
        User user = mock(User.class);
        doNothing().when(user).setConfPassword((String) any());
        doNothing().when(user).setContactNumber((String) any());
        doNothing().when(user).setEmail((String) any());
        doNothing().when(user).setFirstName((String) any());
        doNothing().when(user).setId((String) any());
        doNothing().when(user).setLastName((String) any());
        doNothing().when(user).setPassword((String) any());
        doNothing().when(user).setRole((String) any());
        doNothing().when(user).setUserName((String) any());
        user.setConfPassword("iloveyou");
        user.setContactNumber("42");
        user.setEmail("jane.doe@example.org");
        user.setFirstName("Jane");
        user.setId("42");
        user.setLastName("Doe");
        user.setPassword("iloveyou");
        user.setRole("Role");
        user.setUserName("janedoe");
        ResponseEntity<?> actualRegisterUserResult = authController.registerUser(user);
        assertTrue(actualRegisterUserResult.hasBody());
        assertTrue(actualRegisterUserResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualRegisterUserResult.getStatusCode());
        assertEquals("Issue occur", ((AuthenticationResponse) actualRegisterUserResult.getBody()).getResponse());
        verify(user).setConfPassword((String) any());
        verify(user).setContactNumber((String) any());
        verify(user).setEmail((String) any());
        verify(user).setFirstName((String) any());
        verify(user).setId((String) any());
        verify(user).setLastName((String) any());
        verify(user).setPassword((String) any());
        verify(user).setRole((String) any());
        verify(user).setUserName((String) any());
    }
}

