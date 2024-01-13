/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ModelFile;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;


public class FileSchemaTestClass  {
  
  private ModelFile _file;

  private List<@Valid ModelFile> files = null;

 /**
   * Get _file
   * @return _file
  **/
  public ModelFile getFile() {
    return _file;
  }

  /**
    * Set _file
  **/
  public void setFile(ModelFile _file) {
    this._file = _file;
  }

  public FileSchemaTestClass _file(ModelFile _file) {
    this._file = _file;
    return this;
  }

 /**
   * Get files
   * @return files
  **/
  public List<@Valid ModelFile> getFiles() {
    return files;
  }

  /**
    * Set files
  **/
  public void setFiles(List<@Valid ModelFile> files) {
    this.files = files;
  }

  public FileSchemaTestClass files(List<@Valid ModelFile> files) {
    this.files = files;
    return this;
  }

  public FileSchemaTestClass addFilesItem(ModelFile filesItem) {
    this.files.add(filesItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSchemaTestClass {\n");
    
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
