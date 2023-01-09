package com.example.demo.entity.response;

import com.example.demo.entity.nace.Nace;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.Errors;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@ToString
@Builder
public class GenericResponse {

private String status;
private String message;

private List<Nace> naces;


}
