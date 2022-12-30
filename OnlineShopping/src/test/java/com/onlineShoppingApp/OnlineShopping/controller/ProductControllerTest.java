package com.onlineShoppingApp.OnlineShopping.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyFloat;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.onlineShoppingApp.OnlineShopping.Exception.ProductDoesNotExistException;
import com.onlineShoppingApp.OnlineShopping.dto.ErrorResponse;
import com.onlineShoppingApp.OnlineShopping.model.AddProduct;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class ProductControllerTest {
    /**
     * Method under test: {@link ProductController#createProductRequest(String, AddProduct)}
     */
    @Test
    void testCreateProductRequest() {
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
        //       at com.onlineShoppingApp.OnlineShopping.service.ProductService$$EnhancerByMockitoWithCGLIB$$49ec4eb7.addNewProduct(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.ProductController.createProductRequest(ProductController.java:31)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:681)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        ProductController productController = new ProductController();

        AddProduct addProduct = new AddProduct();
        addProduct.setFeatures("Features");
        addProduct.setPrice(10.0f);
        addProduct.setProductDescription("Product Description");
        addProduct.setProductId("42");
        addProduct.setProductName("Product Name");
        addProduct.setProductQuantity(1);
        addProduct.setProductStatus("Product Status");
        ResponseEntity<?> actualCreateProductRequestResult = productController.createProductRequest("janedoe", addProduct);
        assertTrue(actualCreateProductRequestResult.hasBody());
        assertTrue(actualCreateProductRequestResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.FORBIDDEN, actualCreateProductRequestResult.getStatusCode());
        assertNull(((ErrorResponse) actualCreateProductRequestResult.getBody()).getResponse());
    }

    /**
     * Method under test: {@link ProductController#createProductRequest(String, AddProduct)}
     */
    @Test
    void testCreateProductRequest2() {
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
        //       at com.onlineShoppingApp.OnlineShopping.service.ProductService$$EnhancerByMockitoWithCGLIB$$49ec4eb7.addNewProduct(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.ProductController.createProductRequest(ProductController.java:31)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:681)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        ProductController productController = new ProductController();
        AddProduct addProduct = mock(AddProduct.class);
        doNothing().when(addProduct).setFeatures((String) any());
        doNothing().when(addProduct).setPrice(anyFloat());
        doNothing().when(addProduct).setProductDescription((String) any());
        doNothing().when(addProduct).setProductId((String) any());
        doNothing().when(addProduct).setProductName((String) any());
        doNothing().when(addProduct).setProductQuantity(anyInt());
        doNothing().when(addProduct).setProductStatus((String) any());
        addProduct.setFeatures("Features");
        addProduct.setPrice(10.0f);
        addProduct.setProductDescription("Product Description");
        addProduct.setProductId("42");
        addProduct.setProductName("Product Name");
        addProduct.setProductQuantity(1);
        addProduct.setProductStatus("Product Status");
        ResponseEntity<?> actualCreateProductRequestResult = productController.createProductRequest("janedoe",
                addProduct);
        assertTrue(actualCreateProductRequestResult.hasBody());
        assertTrue(actualCreateProductRequestResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.FORBIDDEN, actualCreateProductRequestResult.getStatusCode());
        assertNull(((ErrorResponse) actualCreateProductRequestResult.getBody()).getResponse());
        verify(addProduct).setFeatures((String) any());
        verify(addProduct).setPrice(anyFloat());
        verify(addProduct).setProductDescription((String) any());
        verify(addProduct).setProductId((String) any());
        verify(addProduct).setProductName((String) any());
        verify(addProduct).setProductQuantity(anyInt());
        verify(addProduct).setProductStatus((String) any());
    }

    /**
     * Method under test: {@link ProductController#getAllProduct()}
     */
    @Test
    void testGetAllProduct() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IncompatibleClassChangeError
        //       at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:93)
        //       at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
        //       at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:38)
        //       at org.mockito.internal.creation.cglib.MethodInterceptorFilter.intercept(MethodInterceptorFilter.java:59)
        //       at com.onlineShoppingApp.OnlineShopping.service.ProductService$$EnhancerByMockitoWithCGLIB$$49ec4eb7.getAllProduct(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.ProductController.getAllProduct(ProductController.java:43)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        ResponseEntity<?> actualAllProduct = (new ProductController()).getAllProduct();
        assertTrue(actualAllProduct.hasBody());
        assertTrue(actualAllProduct.getHeaders().isEmpty());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualAllProduct.getStatusCode());
        assertEquals("Application has faced an issue", ((ErrorResponse) actualAllProduct.getBody()).getResponse());
    }

    /**
     * Method under test: {@link ProductController#getProductByName(String, String)}
     */
    @Test
    void testGetProductByName() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IncompatibleClassChangeError
        //       at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:93)
        //       at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
        //       at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:38)
        //       at org.mockito.internal.creation.cglib.MethodInterceptorFilter.intercept(MethodInterceptorFilter.java:59)
        //       at com.onlineShoppingApp.OnlineShopping.service.ProductService$$EnhancerByMockitoWithCGLIB$$49ec4eb7.getProductByName(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.ProductController.getProductByName(ProductController.java:55)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        ResponseEntity<?> actualProductByName = (new ProductController()).getProductByName("Productname",
                "Logged In User");
        assertTrue(actualProductByName.hasBody());
        assertTrue(actualProductByName.getHeaders().isEmpty());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualProductByName.getStatusCode());
        assertEquals("Application has faced an issue", ((ErrorResponse) actualProductByName.getBody()).getResponse());
    }

    /**
     * Method under test: {@link ProductController#updateProduct(String, String, String, AddProduct)}
     */
    @Test
    void testUpdateProduct() throws ProductDoesNotExistException {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IncompatibleClassChangeError
        //       at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:93)
        //       at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
        //       at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:38)
        //       at org.mockito.internal.creation.cglib.MethodInterceptorFilter.intercept(MethodInterceptorFilter.java:59)
        //       at com.onlineShoppingApp.OnlineShopping.service.ProductService$$EnhancerByMockitoWithCGLIB$$49ec4eb7.updateProduct(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.ProductController.updateProduct(ProductController.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:684)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        ProductController productController = new ProductController();

        AddProduct addProduct = new AddProduct();
        addProduct.setFeatures("Features");
        addProduct.setPrice(10.0f);
        addProduct.setProductDescription("Product Description");
        addProduct.setProductId("42");
        addProduct.setProductName("Product Name");
        addProduct.setProductQuantity(1);
        addProduct.setProductStatus("Product Status");
        ResponseEntity<?> actualUpdateProductResult = productController.updateProduct("Productname", "42",
                "Logged In User", addProduct);
        assertTrue(actualUpdateProductResult.hasBody());
        assertTrue(actualUpdateProductResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualUpdateProductResult.getStatusCode());
        assertEquals("Application has faced an issue",
                ((ErrorResponse) actualUpdateProductResult.getBody()).getResponse());
    }

    /**
     * Method under test: {@link ProductController#updateProduct(String, String, String, AddProduct)}
     */
    @Test
    void testUpdateProduct2() throws ProductDoesNotExistException {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IncompatibleClassChangeError
        //       at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:93)
        //       at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
        //       at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:38)
        //       at org.mockito.internal.creation.cglib.MethodInterceptorFilter.intercept(MethodInterceptorFilter.java:59)
        //       at com.onlineShoppingApp.OnlineShopping.service.ProductService$$EnhancerByMockitoWithCGLIB$$49ec4eb7.updateProduct(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.ProductController.updateProduct(ProductController.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:684)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        ProductController productController = new ProductController();
        AddProduct addProduct = mock(AddProduct.class);
        doNothing().when(addProduct).setFeatures((String) any());
        doNothing().when(addProduct).setPrice(anyFloat());
        doNothing().when(addProduct).setProductDescription((String) any());
        doNothing().when(addProduct).setProductId((String) any());
        doNothing().when(addProduct).setProductName((String) any());
        doNothing().when(addProduct).setProductQuantity(anyInt());
        doNothing().when(addProduct).setProductStatus((String) any());
        addProduct.setFeatures("Features");
        addProduct.setPrice(10.0f);
        addProduct.setProductDescription("Product Description");
        addProduct.setProductId("42");
        addProduct.setProductName("Product Name");
        addProduct.setProductQuantity(1);
        addProduct.setProductStatus("Product Status");
        ResponseEntity<?> actualUpdateProductResult = productController.updateProduct("Productname", "42",
                "Logged In User", addProduct);
        assertTrue(actualUpdateProductResult.hasBody());
        assertTrue(actualUpdateProductResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualUpdateProductResult.getStatusCode());
        assertEquals("Application has faced an issue",
                ((ErrorResponse) actualUpdateProductResult.getBody()).getResponse());
        verify(addProduct).setFeatures((String) any());
        verify(addProduct).setPrice(anyFloat());
        verify(addProduct).setProductDescription((String) any());
        verify(addProduct).setProductId((String) any());
        verify(addProduct).setProductName((String) any());
        verify(addProduct).setProductQuantity(anyInt());
        verify(addProduct).setProductStatus((String) any());
    }

    /**
     * Method under test: {@link ProductController#deleteProduct(String, String, String)}
     */
    @Test
    void testDeleteProduct() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IncompatibleClassChangeError
        //       at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:93)
        //       at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
        //       at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:38)
        //       at org.mockito.internal.creation.cglib.MethodInterceptorFilter.intercept(MethodInterceptorFilter.java:59)
        //       at com.onlineShoppingApp.OnlineShopping.service.ProductService$$EnhancerByMockitoWithCGLIB$$49ec4eb7.deleteProduct(<generated>)
        //       at com.onlineShoppingApp.OnlineShopping.controller.ProductController.deleteProduct(ProductController.java:87)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:687)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        ResponseEntity<?> actualDeleteProductResult = (new ProductController()).deleteProduct("Productname", "42",
                "User ID");
        assertTrue(actualDeleteProductResult.hasBody());
        assertTrue(actualDeleteProductResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualDeleteProductResult.getStatusCode());
        assertEquals("Application has faced an issue",
                ((ErrorResponse) actualDeleteProductResult.getBody()).getResponse());
    }
}

