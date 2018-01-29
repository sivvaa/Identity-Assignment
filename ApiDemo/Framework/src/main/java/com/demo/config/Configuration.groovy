package com.demo.config

import java.io.File
import java.io.FileReader
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.InputStream
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Map;

import org.yaml.snakeyaml.Yaml


class Configuration {
    Map<String, ArrayList> getConfig() {
        def yamlParsers = new HashMap<String, ArrayList>()
        try {
            def yaml = new Yaml()
            yamlParsers = (Map<String, ArrayList>) yaml.load(new FileReader("C:/MyFolder/SoapUi/abcd.yml"))
            //ArrayList rooms = (ArrayList) yamlParsers.get("room")

        } catch (FileNotFoundException e) {
            e.printStackTrace()
        }
        return yamlParsers
    }
}
