package com.flexo.ok;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) throws Exception {
        MapperSetting setting = new MapperSetting(8080, 80, "http://www.odnoklassniki.ru/");
        List<MapperSetting> settings = new ArrayList<MapperSetting>();
        settings.add(setting);

        TcpPortMapper mapper = new TcpPortMapper(settings);
        mapper.start();
    }
}
