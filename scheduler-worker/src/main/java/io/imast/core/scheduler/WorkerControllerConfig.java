package io.imast.core.scheduler;

import java.time.Duration;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The job manager configuration
 * 
 * @author davitp
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WorkerControllerConfig {
    
    /**
     * Should supervise job management
     */
    private boolean supervise;
    
    /**
     * The agent name job manager runs on
     */
    private String worker;
    
    /**
     * The manager cluster name
     */
    private String cluster;
    
    /**
     * The level of parallelism
     */
    private Long parallelism;
    
    /**
     * The frequency of job sync
     */
    private Duration jobSyncRate;
    
    /**
     * The frequency of agent updates
     */
    private Duration workerSignalRate;
    
    /**
     * The type of clustering
     */
    private ClusteringType clusteringType;
    
    /**
     * The data source
     */
    private String dataSource;
    
    /**
     * The data source URI
     */
    private String dataSourceUri;
    
    /**
     * The data source username
     */
    private String dataSourceUsername;
    
    /**
     * The data source password
     */
    private String dataSourcePassword;
}
