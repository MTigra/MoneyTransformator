package com.example.unitconversion;
//@Configuration
//public class WebServerFacotryCustomizerConfiguration implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
//
//    @Value("${port.number.min:8080}")
//    private Integer minPort;
//
//    @Value("${port.number.max:8200}")
//    private Integer maxPort;
//
//    @Override
//    public void customize(ConfigurableServletWebServerFactory factory) {
//        int port = SocketUtils.findAvailableTcpPort(minPort, maxPort);
//        factory.setPort(port);
//        System.getProperties().put("server.port", port);
//    }
//}