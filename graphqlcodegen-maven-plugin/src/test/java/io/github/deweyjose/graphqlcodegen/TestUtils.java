package io.github.deweyjose.graphqlcodegen;

import java.io.File;
import java.nio.file.Files;
import lombok.SneakyThrows;

public class TestUtils {
  public static final String TEST_SCHEMA_URL =
      "https://raw.githubusercontent.com/deweyjose/graphqlcodegen/main/graphqlcodegen-maven-plugin/src/test/resources/schema/foo.graphqls";

  /**
   * wrapper for resource File objects
   *
   * @param path
   * @return File
   */
  public static File getFile(String path) {
    return new File(TestUtils.class.getClassLoader().getResource(path).getFile());
  }

  @SneakyThrows
  public static String getFileContent(String path) {
    return new String(Files.readAllBytes(getFile(path).toPath()));
  }
}
