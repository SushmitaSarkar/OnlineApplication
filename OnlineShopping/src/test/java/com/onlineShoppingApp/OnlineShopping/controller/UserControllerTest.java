package com.onlineShoppingApp.OnlineShopping.controller;

import com.onlineShoppingApp.OnlineShopping.dto.AuthenticationResponse;
import com.onlineShoppingApp.OnlineShopping.dto.Password;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class UserControllerTest {
    /**
     * Method under test: {@link UserController#changePassowrd(String, Password)}
     */
    @Test
    void testChangePassowrd() {
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
        //       at com.onlineShoppingApp.OnlineShopping.service.UserService$$EnhancerByMockitoWithCGLIB$$74b7b0f4.changePassword(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.UserController.changePassowrd(UserController.java:22)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:684)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        UserController userController = new UserController();
        ResponseEntity<?> actualChangePassowrdResult = userController.changePassowrd("janedoe",
                new Password("iloveyou", "Contact"));
        assertTrue(actualChangePassowrdResult.hasBody());
        assertTrue(actualChangePassowrdResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualChangePassowrdResult.getStatusCode());
        assertEquals("Unable to change password",
                ((AuthenticationResponse) actualChangePassowrdResult.getBody()).getResponse());
    }

    /**
     * Method under test: {@link UserController#changePassowrd(String, Password)}
     */
    @Test
    void testChangePassowrd2() {
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
        //       at com.onlineShoppingApp.OnlineShopping.service.UserService$$EnhancerByMockitoWithCGLIB$$74b7b0f4.changePassword(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.UserController.changePassowrd(UserController.java:22)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:684)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        ResponseEntity<?> actualChangePassowrdResult = (new UserController()).changePassowrd("janedoe", null);
        assertTrue(actualChangePassowrdResult.hasBody());
        assertTrue(actualChangePassowrdResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualChangePassowrdResult.getStatusCode());
        assertEquals("Unable to change password",
                ((AuthenticationResponse) actualChangePassowrdResult.getBody()).getResponse());
    }

    /**
     * Method under test: {@link UserController#changePassowrd(String, Password)}
     */
    @Test
    void testChangePassowrd3() {
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
        //       at com.onlineShoppingApp.OnlineShopping.service.UserService$$EnhancerByMockitoWithCGLIB$$74b7b0f4.changePassword(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.UserController.changePassowrd(UserController.java:22)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:684)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        UserController userController = new UserController();
        Password password = mock(Password.class);
        when(password.getContact()).thenReturn("Contact");
        when(password.getNewPassword()).thenReturn("iloveyou");
        ResponseEntity<?> actualChangePassowrdResult = userController.changePassowrd("janedoe", password);
        assertTrue(actualChangePassowrdResult.hasBody());
        assertTrue(actualChangePassowrdResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualChangePassowrdResult.getStatusCode());
        assertEquals("Unable to change password",
                ((AuthenticationResponse) actualChangePassowrdResult.getBody()).getResponse());
        verify(password).getContact();
        verify(password).getNewPassword();
    }

    /**
     * Method under test: {@link UserController#getAllUsers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllUsers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.onlineShoppingApp.OnlineShopping.controller.UserController.getAllUsers(UserController.java:33)
        //   See https://diff.blue/R013 to resolve this issue.

        (new UserController()).getAllUsers();
    }

    /**
     * Method under test: {@link UserController#searchForUsers(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearchForUsers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.onlineShoppingApp.OnlineShopping.controller.UserController.searchForUsers(UserController.java:40)
        //   See https://diff.blue/R013 to resolve this issue.

        (new UserController()).searchForUsers("janedoe");
    }
}

