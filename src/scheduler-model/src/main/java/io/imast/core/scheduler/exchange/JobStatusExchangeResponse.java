package io.imast.core.scheduler.exchange;

import io.imast.core.scheduler.JobDefinition;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The status exchange response 
 * 
 * @author davitp
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobStatusExchangeResponse{
    
    /**
     * The group of response
     */
    private String group;
    
    /**
     * The job type
     */
    private String type;
    
    /**
     * The set of removed jobs
     */
    private List<String> removed;
    
    /**
     * The set of updated jobs
     */
    private Map<String, JobDefinition> updated;
    
    /**
     * The set of added new jobs
     */
    private Map<String, JobDefinition> added;
}