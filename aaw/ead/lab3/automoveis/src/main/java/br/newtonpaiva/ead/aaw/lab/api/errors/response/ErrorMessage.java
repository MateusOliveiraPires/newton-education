package br.newtonpaiva.ead.aaw.lab.api.errors.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@AllArgsConstructor
@NoArgsConstructor
@With
public class ErrorMessage {

	  private String title;

	  private String description;

	  private String source;

}
