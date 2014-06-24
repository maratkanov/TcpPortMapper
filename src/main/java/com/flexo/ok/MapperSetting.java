package com.flexo.ok;

public class MapperSetting {

    private int localPort;
    private int remotePort;
    private String remoteHost;

    public MapperSetting(int localPort, int remotePort, String remoteHost) {
        this.localPort = localPort;
        this.remotePort = remotePort;
        this.remoteHost = remoteHost;
    }

    public int getLocalPort() {
        return localPort;
    }

    public int getRemotePort() {
        return remotePort;
    }

    public String getRemoteHost() {
        return remoteHost;
    }
}
