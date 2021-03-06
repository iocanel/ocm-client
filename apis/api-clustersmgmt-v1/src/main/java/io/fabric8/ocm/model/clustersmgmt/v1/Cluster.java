/*
 * clusters_mgmt
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: ocm-feedback@redhat.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.fabric8.ocm.model.clustersmgmt.v1;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.ocm.model.clustersmgmt.v1.AWS;
import io.fabric8.ocm.model.clustersmgmt.v1.AWSInfrastructureAccessRoleGrant;
import io.fabric8.ocm.model.clustersmgmt.v1.AddOnInstallation;
import io.fabric8.ocm.model.clustersmgmt.v1.CCS;
import io.fabric8.ocm.model.clustersmgmt.v1.CloudProvider;
import io.fabric8.ocm.model.clustersmgmt.v1.CloudRegion;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterAPI;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterConsole;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterHealthState;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterMetrics;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterNodes;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterState;
import io.fabric8.ocm.model.clustersmgmt.v1.ClusterStatus;
import io.fabric8.ocm.model.clustersmgmt.v1.DNS;
import io.fabric8.ocm.model.clustersmgmt.v1.ExternalConfiguration;
import io.fabric8.ocm.model.clustersmgmt.v1.Flavour;
import io.fabric8.ocm.model.clustersmgmt.v1.GCP;
import io.fabric8.ocm.model.clustersmgmt.v1.Group;
import io.fabric8.ocm.model.clustersmgmt.v1.IdentityProvider;
import io.fabric8.ocm.model.clustersmgmt.v1.Ingress;
import io.fabric8.ocm.model.clustersmgmt.v1.MachinePool;
import io.fabric8.ocm.model.clustersmgmt.v1.Network;
import io.fabric8.ocm.model.clustersmgmt.v1.Product;
import io.fabric8.ocm.model.clustersmgmt.v1.ProvisionShard;
import io.fabric8.ocm.model.clustersmgmt.v1.Subscription;
import io.fabric8.ocm.model.clustersmgmt.v1.Value;
import io.fabric8.ocm.model.clustersmgmt.v1.Version;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Definition of an _OpenShift_ cluster.  The &#x60;cloud_provider&#x60; attribute is a reference to the cloud provider. When a cluster is retrieved it will be a link to the cloud provider, containing only the kind, id and href attributes:   &#x60;&#x60;&#x60; {   \&quot;cloud_provider\&quot;: {     \&quot;kind\&quot;: \&quot;CloudProviderLink\&quot;,     \&quot;id\&quot;: \&quot;123\&quot;,     \&quot;href\&quot;: \&quot;/api/clusters_mgmt/v1/cloud_providers/123\&quot;   } } &#x60;&#x60;&#x60;  When a cluster is created this is optional, and if used it should contain the identifier of the cloud provider to use:   &#x60;&#x60;&#x60; {   \&quot;cloud_provider\&quot;: {     \&quot;id\&quot;: \&quot;123\&quot;,   } } &#x60;&#x60;&#x60;  If not included, then the cluster will be created using the default cloud provider, which is currently Amazon Web Services.  The region attribute is mandatory when a cluster is created.  The &#x60;aws.access_key_id&#x60;, &#x60;aws.secret_access_key&#x60; and &#x60;dns.base_domain&#x60; attributes are mandatory when creation a cluster with your own Amazon Web Services account. 
 */
@Schema(description = "Definition of an _OpenShift_ cluster.  The `cloud_provider` attribute is a reference to the cloud provider. When a cluster is retrieved it will be a link to the cloud provider, containing only the kind, id and href attributes:   ``` {   \"cloud_provider\": {     \"kind\": \"CloudProviderLink\",     \"id\": \"123\",     \"href\": \"/api/clusters_mgmt/v1/cloud_providers/123\"   } } ```  When a cluster is created this is optional, and if used it should contain the identifier of the cloud provider to use:   ``` {   \"cloud_provider\": {     \"id\": \"123\",   } } ```  If not included, then the cluster will be created using the default cloud provider, which is currently Amazon Web Services.  The region attribute is mandatory when a cluster is created.  The `aws.access_key_id`, `aws.secret_access_key` and `dns.base_domain` attributes are mandatory when creation a cluster with your own Amazon Web Services account. ")

public class Cluster {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("api")
  private ClusterAPI api = null;

  @JsonProperty("aws")
  private AWS aws = null;

  @JsonProperty("aws_infrastructure_access_role_grants")
  private List<AWSInfrastructureAccessRoleGrant> awsInfrastructureAccessRoleGrants = null;

  @JsonProperty("ccs")
  private CCS ccs = null;

  @JsonProperty("dns")
  private DNS dns = null;

  @JsonProperty("gcp")
  private GCP gcp = null;

  @JsonProperty("addons")
  private List<AddOnInstallation> addons = null;

  @JsonProperty("cloud_provider")
  private CloudProvider cloudProvider = null;

  @JsonProperty("cluster_admin_enabled")
  private Boolean clusterAdminEnabled = null;

  @JsonProperty("console")
  private ClusterConsole console = null;

  @JsonProperty("creation_timestamp")
  private LocalDateTime creationTimestamp = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("expiration_timestamp")
  private LocalDateTime expirationTimestamp = null;

  @JsonProperty("external_id")
  private String externalId = null;

  @JsonProperty("external_configuration")
  private ExternalConfiguration externalConfiguration = null;

  @JsonProperty("flavour")
  private Flavour flavour = null;

  @JsonProperty("groups")
  private List<Group> groups = null;

  @JsonProperty("health_state")
  private ClusterHealthState healthState = null;

  @JsonProperty("identity_providers")
  private List<IdentityProvider> identityProviders = null;

  @JsonProperty("ingresses")
  private List<Ingress> ingresses = null;

  @JsonProperty("load_balancer_quota")
  private Integer loadBalancerQuota = null;

  @JsonProperty("machine_pools")
  private List<MachinePool> machinePools = null;

  @JsonProperty("managed")
  private Boolean managed = null;

  @JsonProperty("metrics")
  private ClusterMetrics metrics = null;

  @JsonProperty("multi_az")
  private Boolean multiAz = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("network")
  private Network network = null;

  @JsonProperty("nodes")
  private ClusterNodes nodes = null;

  @JsonProperty("openshift_version")
  private String openshiftVersion = null;

  @JsonProperty("product")
  private Product product = null;

  @JsonProperty("properties")
  private Map<String, String> properties = null;

  @JsonProperty("provision_shard")
  private ProvisionShard provisionShard = null;

  @JsonProperty("region")
  private CloudRegion region = null;

  @JsonProperty("state")
  private ClusterState state = null;

  @JsonProperty("status")
  private ClusterStatus status = null;

  @JsonProperty("storage_quota")
  private Value storageQuota = null;

  @JsonProperty("subscription")
  private Subscription subscription = null;

  @JsonProperty("version")
  private Version version = null;

  public Cluster kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#x27;Cluster&#x27; if this is a complete object or &#x27;ClusterLink&#x27; if it is just a link. 
   * @return kind
  **/
  @Schema(description = "Indicates the type of this object. Will be 'Cluster' if this is a complete object or 'ClusterLink' if it is just a link. ")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Cluster id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the object. 
   * @return id
  **/
  @Schema(description = "Unique identifier of the object. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Cluster href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Self link. 
   * @return href
  **/
  @Schema(description = "Self link. ")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Cluster api(ClusterAPI api) {
    this.api = api;
    return this;
  }

   /**
   * Get api
   * @return api
  **/
  @Schema(description = "")
  public ClusterAPI getApi() {
    return api;
  }

  public void setApi(ClusterAPI api) {
    this.api = api;
  }

  public Cluster aws(AWS aws) {
    this.aws = aws;
    return this;
  }

   /**
   * Get aws
   * @return aws
  **/
  @Schema(description = "")
  public AWS getAws() {
    return aws;
  }

  public void setAws(AWS aws) {
    this.aws = aws;
  }

  public Cluster awsInfrastructureAccessRoleGrants(List<AWSInfrastructureAccessRoleGrant> awsInfrastructureAccessRoleGrants) {
    this.awsInfrastructureAccessRoleGrants = awsInfrastructureAccessRoleGrants;
    return this;
  }

  public Cluster addAwsInfrastructureAccessRoleGrantsItem(AWSInfrastructureAccessRoleGrant awsInfrastructureAccessRoleGrantsItem) {
    if (this.awsInfrastructureAccessRoleGrants == null) {
      this.awsInfrastructureAccessRoleGrants = new ArrayList<>();
    }
    this.awsInfrastructureAccessRoleGrants.add(awsInfrastructureAccessRoleGrantsItem);
    return this;
  }

   /**
   * List of AWS infrastructure access role grants on this cluster. 
   * @return awsInfrastructureAccessRoleGrants
  **/
  @Schema(description = "List of AWS infrastructure access role grants on this cluster. ")
  public List<AWSInfrastructureAccessRoleGrant> getAwsInfrastructureAccessRoleGrants() {
    return awsInfrastructureAccessRoleGrants;
  }

  public void setAwsInfrastructureAccessRoleGrants(List<AWSInfrastructureAccessRoleGrant> awsInfrastructureAccessRoleGrants) {
    this.awsInfrastructureAccessRoleGrants = awsInfrastructureAccessRoleGrants;
  }

  public Cluster ccs(CCS ccs) {
    this.ccs = ccs;
    return this;
  }

   /**
   * Get ccs
   * @return ccs
  **/
  @Schema(description = "")
  public CCS getCcs() {
    return ccs;
  }

  public void setCcs(CCS ccs) {
    this.ccs = ccs;
  }

  public Cluster dns(DNS dns) {
    this.dns = dns;
    return this;
  }

   /**
   * Get dns
   * @return dns
  **/
  @Schema(description = "")
  public DNS getDns() {
    return dns;
  }

  public void setDns(DNS dns) {
    this.dns = dns;
  }

  public Cluster gcp(GCP gcp) {
    this.gcp = gcp;
    return this;
  }

   /**
   * Get gcp
   * @return gcp
  **/
  @Schema(description = "")
  public GCP getGcp() {
    return gcp;
  }

  public void setGcp(GCP gcp) {
    this.gcp = gcp;
  }

  public Cluster addons(List<AddOnInstallation> addons) {
    this.addons = addons;
    return this;
  }

  public Cluster addAddonsItem(AddOnInstallation addonsItem) {
    if (this.addons == null) {
      this.addons = new ArrayList<>();
    }
    this.addons.add(addonsItem);
    return this;
  }

   /**
   * List of add-ons on this cluster. 
   * @return addons
  **/
  @Schema(description = "List of add-ons on this cluster. ")
  public List<AddOnInstallation> getAddons() {
    return addons;
  }

  public void setAddons(List<AddOnInstallation> addons) {
    this.addons = addons;
  }

  public Cluster cloudProvider(CloudProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Get cloudProvider
   * @return cloudProvider
  **/
  @Schema(description = "")
  public CloudProvider getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CloudProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  public Cluster clusterAdminEnabled(Boolean clusterAdminEnabled) {
    this.clusterAdminEnabled = clusterAdminEnabled;
    return this;
  }

   /**
   * Flag indicating if cluster-admin access is enabled. 
   * @return clusterAdminEnabled
  **/
  @Schema(description = "Flag indicating if cluster-admin access is enabled. ")
  public Boolean isClusterAdminEnabled() {
    return clusterAdminEnabled;
  }

  public void setClusterAdminEnabled(Boolean clusterAdminEnabled) {
    this.clusterAdminEnabled = clusterAdminEnabled;
  }

  public Cluster console(ClusterConsole console) {
    this.console = console;
    return this;
  }

   /**
   * Get console
   * @return console
  **/
  @Schema(description = "")
  public ClusterConsole getConsole() {
    return console;
  }

  public void setConsole(ClusterConsole console) {
    this.console = console;
  }

  public Cluster creationTimestamp(LocalDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * Date and time when the cluster was initially created, using the format defined in https://www.ietf.org/rfc/rfc3339.txt[RC3339]. 
   * @return creationTimestamp
  **/
  @Schema(description = "Date and time when the cluster was initially created, using the format defined in https://www.ietf.org/rfc/rfc3339.txt[RC3339]. ")
  public LocalDateTime getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(LocalDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public Cluster displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the cluster for display purposes. It can contain any characters, including spaces. 
   * @return displayName
  **/
  @Schema(description = "Name of the cluster for display purposes. It can contain any characters, including spaces. ")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Cluster expirationTimestamp(LocalDateTime expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
    return this;
  }

   /**
   * Date and time when the cluster will be automatically deleted, using the format defined in https://www.ietf.org/rfc/rfc3339.txt[RFC3339]. If no timestamp is provided, the cluster will never expire.  This option is unsupported. 
   * @return expirationTimestamp
  **/
  @Schema(description = "Date and time when the cluster will be automatically deleted, using the format defined in https://www.ietf.org/rfc/rfc3339.txt[RFC3339]. If no timestamp is provided, the cluster will never expire.  This option is unsupported. ")
  public LocalDateTime getExpirationTimestamp() {
    return expirationTimestamp;
  }

  public void setExpirationTimestamp(LocalDateTime expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
  }

  public Cluster externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External identifier of the cluster, generated by the installer. 
   * @return externalId
  **/
  @Schema(description = "External identifier of the cluster, generated by the installer. ")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Cluster externalConfiguration(ExternalConfiguration externalConfiguration) {
    this.externalConfiguration = externalConfiguration;
    return this;
  }

   /**
   * Get externalConfiguration
   * @return externalConfiguration
  **/
  @Schema(description = "")
  public ExternalConfiguration getExternalConfiguration() {
    return externalConfiguration;
  }

  public void setExternalConfiguration(ExternalConfiguration externalConfiguration) {
    this.externalConfiguration = externalConfiguration;
  }

  public Cluster flavour(Flavour flavour) {
    this.flavour = flavour;
    return this;
  }

   /**
   * Get flavour
   * @return flavour
  **/
  @Schema(description = "")
  public Flavour getFlavour() {
    return flavour;
  }

  public void setFlavour(Flavour flavour) {
    this.flavour = flavour;
  }

  public Cluster groups(List<Group> groups) {
    this.groups = groups;
    return this;
  }

  public Cluster addGroupsItem(Group groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Link to the collection of groups of user of the cluster. 
   * @return groups
  **/
  @Schema(description = "Link to the collection of groups of user of the cluster. ")
  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  public Cluster healthState(ClusterHealthState healthState) {
    this.healthState = healthState;
    return this;
  }

   /**
   * Get healthState
   * @return healthState
  **/
  @Schema(description = "")
  public ClusterHealthState getHealthState() {
    return healthState;
  }

  public void setHealthState(ClusterHealthState healthState) {
    this.healthState = healthState;
  }

  public Cluster identityProviders(List<IdentityProvider> identityProviders) {
    this.identityProviders = identityProviders;
    return this;
  }

  public Cluster addIdentityProvidersItem(IdentityProvider identityProvidersItem) {
    if (this.identityProviders == null) {
      this.identityProviders = new ArrayList<>();
    }
    this.identityProviders.add(identityProvidersItem);
    return this;
  }

   /**
   * Link to the collection of identity providers of the cluster. 
   * @return identityProviders
  **/
  @Schema(description = "Link to the collection of identity providers of the cluster. ")
  public List<IdentityProvider> getIdentityProviders() {
    return identityProviders;
  }

  public void setIdentityProviders(List<IdentityProvider> identityProviders) {
    this.identityProviders = identityProviders;
  }

  public Cluster ingresses(List<Ingress> ingresses) {
    this.ingresses = ingresses;
    return this;
  }

  public Cluster addIngressesItem(Ingress ingressesItem) {
    if (this.ingresses == null) {
      this.ingresses = new ArrayList<>();
    }
    this.ingresses.add(ingressesItem);
    return this;
  }

   /**
   * List of ingresses on this cluster. 
   * @return ingresses
  **/
  @Schema(description = "List of ingresses on this cluster. ")
  public List<Ingress> getIngresses() {
    return ingresses;
  }

  public void setIngresses(List<Ingress> ingresses) {
    this.ingresses = ingresses;
  }

  public Cluster loadBalancerQuota(Integer loadBalancerQuota) {
    this.loadBalancerQuota = loadBalancerQuota;
    return this;
  }

   /**
   * Load Balancer quota to be assigned to the cluster. 
   * @return loadBalancerQuota
  **/
  @Schema(description = "Load Balancer quota to be assigned to the cluster. ")
  public Integer getLoadBalancerQuota() {
    return loadBalancerQuota;
  }

  public void setLoadBalancerQuota(Integer loadBalancerQuota) {
    this.loadBalancerQuota = loadBalancerQuota;
  }

  public Cluster machinePools(List<MachinePool> machinePools) {
    this.machinePools = machinePools;
    return this;
  }

  public Cluster addMachinePoolsItem(MachinePool machinePoolsItem) {
    if (this.machinePools == null) {
      this.machinePools = new ArrayList<>();
    }
    this.machinePools.add(machinePoolsItem);
    return this;
  }

   /**
   * List of machine pools on this cluster. 
   * @return machinePools
  **/
  @Schema(description = "List of machine pools on this cluster. ")
  public List<MachinePool> getMachinePools() {
    return machinePools;
  }

  public void setMachinePools(List<MachinePool> machinePools) {
    this.machinePools = machinePools;
  }

  public Cluster managed(Boolean managed) {
    this.managed = managed;
    return this;
  }

   /**
   * Flag indicating if the cluster is managed (by Red Hat) or self-managed by the user. 
   * @return managed
  **/
  @Schema(description = "Flag indicating if the cluster is managed (by Red Hat) or self-managed by the user. ")
  public Boolean isManaged() {
    return managed;
  }

  public void setManaged(Boolean managed) {
    this.managed = managed;
  }

  public Cluster metrics(ClusterMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @Schema(description = "")
  public ClusterMetrics getMetrics() {
    return metrics;
  }

  public void setMetrics(ClusterMetrics metrics) {
    this.metrics = metrics;
  }

  public Cluster multiAz(Boolean multiAz) {
    this.multiAz = multiAz;
    return this;
  }

   /**
   * Flag indicating if the cluster should be created with nodes in different availability zones or all the nodes in a single one randomly selected. 
   * @return multiAz
  **/
  @Schema(description = "Flag indicating if the cluster should be created with nodes in different availability zones or all the nodes in a single one randomly selected. ")
  public Boolean isMultiAz() {
    return multiAz;
  }

  public void setMultiAz(Boolean multiAz) {
    this.multiAz = multiAz;
  }

  public Cluster name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the cluster. This name is assigned by the user when the cluster is created. 
   * @return name
  **/
  @Schema(description = "Name of the cluster. This name is assigned by the user when the cluster is created. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cluster network(Network network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @Schema(description = "")
  public Network getNetwork() {
    return network;
  }

  public void setNetwork(Network network) {
    this.network = network;
  }

  public Cluster nodes(ClusterNodes nodes) {
    this.nodes = nodes;
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @Schema(description = "")
  public ClusterNodes getNodes() {
    return nodes;
  }

  public void setNodes(ClusterNodes nodes) {
    this.nodes = nodes;
  }

  public Cluster openshiftVersion(String openshiftVersion) {
    this.openshiftVersion = openshiftVersion;
    return this;
  }

   /**
   * Version of _OpenShift_ installed in the cluster, for example &#x60;4.0.0-0.2&#x60;.  When retrieving a cluster this will always be reported.  When provisioning a cluster this will be ignored, as the version to deploy will be determined internally. 
   * @return openshiftVersion
  **/
  @Schema(description = "Version of _OpenShift_ installed in the cluster, for example `4.0.0-0.2`.  When retrieving a cluster this will always be reported.  When provisioning a cluster this will be ignored, as the version to deploy will be determined internally. ")
  public String getOpenshiftVersion() {
    return openshiftVersion;
  }

  public void setOpenshiftVersion(String openshiftVersion) {
    this.openshiftVersion = openshiftVersion;
  }

  public Cluster product(Product product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Cluster properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Cluster putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * User defined properties for tagging and querying. 
   * @return properties
  **/
  @Schema(description = "User defined properties for tagging and querying. ")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public Cluster provisionShard(ProvisionShard provisionShard) {
    this.provisionShard = provisionShard;
    return this;
  }

   /**
   * Get provisionShard
   * @return provisionShard
  **/
  @Schema(description = "")
  public ProvisionShard getProvisionShard() {
    return provisionShard;
  }

  public void setProvisionShard(ProvisionShard provisionShard) {
    this.provisionShard = provisionShard;
  }

  public Cluster region(CloudRegion region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public CloudRegion getRegion() {
    return region;
  }

  public void setRegion(CloudRegion region) {
    this.region = region;
  }

  public Cluster state(ClusterState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public ClusterState getState() {
    return state;
  }

  public void setState(ClusterState state) {
    this.state = state;
  }

  public Cluster status(ClusterStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public ClusterStatus getStatus() {
    return status;
  }

  public void setStatus(ClusterStatus status) {
    this.status = status;
  }

  public Cluster storageQuota(Value storageQuota) {
    this.storageQuota = storageQuota;
    return this;
  }

   /**
   * Get storageQuota
   * @return storageQuota
  **/
  @Schema(description = "")
  public Value getStorageQuota() {
    return storageQuota;
  }

  public void setStorageQuota(Value storageQuota) {
    this.storageQuota = storageQuota;
  }

  public Cluster subscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @Schema(description = "")
  public Subscription getSubscription() {
    return subscription;
  }

  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  public Cluster version(Version version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    return Objects.equals(this.kind, cluster.kind) &&
        Objects.equals(this.id, cluster.id) &&
        Objects.equals(this.href, cluster.href) &&
        Objects.equals(this.api, cluster.api) &&
        Objects.equals(this.aws, cluster.aws) &&
        Objects.equals(this.awsInfrastructureAccessRoleGrants, cluster.awsInfrastructureAccessRoleGrants) &&
        Objects.equals(this.ccs, cluster.ccs) &&
        Objects.equals(this.dns, cluster.dns) &&
        Objects.equals(this.gcp, cluster.gcp) &&
        Objects.equals(this.addons, cluster.addons) &&
        Objects.equals(this.cloudProvider, cluster.cloudProvider) &&
        Objects.equals(this.clusterAdminEnabled, cluster.clusterAdminEnabled) &&
        Objects.equals(this.console, cluster.console) &&
        Objects.equals(this.creationTimestamp, cluster.creationTimestamp) &&
        Objects.equals(this.displayName, cluster.displayName) &&
        Objects.equals(this.expirationTimestamp, cluster.expirationTimestamp) &&
        Objects.equals(this.externalId, cluster.externalId) &&
        Objects.equals(this.externalConfiguration, cluster.externalConfiguration) &&
        Objects.equals(this.flavour, cluster.flavour) &&
        Objects.equals(this.groups, cluster.groups) &&
        Objects.equals(this.healthState, cluster.healthState) &&
        Objects.equals(this.identityProviders, cluster.identityProviders) &&
        Objects.equals(this.ingresses, cluster.ingresses) &&
        Objects.equals(this.loadBalancerQuota, cluster.loadBalancerQuota) &&
        Objects.equals(this.machinePools, cluster.machinePools) &&
        Objects.equals(this.managed, cluster.managed) &&
        Objects.equals(this.metrics, cluster.metrics) &&
        Objects.equals(this.multiAz, cluster.multiAz) &&
        Objects.equals(this.name, cluster.name) &&
        Objects.equals(this.network, cluster.network) &&
        Objects.equals(this.nodes, cluster.nodes) &&
        Objects.equals(this.openshiftVersion, cluster.openshiftVersion) &&
        Objects.equals(this.product, cluster.product) &&
        Objects.equals(this.properties, cluster.properties) &&
        Objects.equals(this.provisionShard, cluster.provisionShard) &&
        Objects.equals(this.region, cluster.region) &&
        Objects.equals(this.state, cluster.state) &&
        Objects.equals(this.status, cluster.status) &&
        Objects.equals(this.storageQuota, cluster.storageQuota) &&
        Objects.equals(this.subscription, cluster.subscription) &&
        Objects.equals(this.version, cluster.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, href, api, aws, awsInfrastructureAccessRoleGrants, ccs, dns, gcp, addons, cloudProvider, clusterAdminEnabled, console, creationTimestamp, displayName, expirationTimestamp, externalId, externalConfiguration, flavour, groups, healthState, identityProviders, ingresses, loadBalancerQuota, machinePools, managed, metrics, multiAz, name, network, nodes, openshiftVersion, product, properties, provisionShard, region, state, status, storageQuota, subscription, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
    sb.append("    awsInfrastructureAccessRoleGrants: ").append(toIndentedString(awsInfrastructureAccessRoleGrants)).append("\n");
    sb.append("    ccs: ").append(toIndentedString(ccs)).append("\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    gcp: ").append(toIndentedString(gcp)).append("\n");
    sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    clusterAdminEnabled: ").append(toIndentedString(clusterAdminEnabled)).append("\n");
    sb.append("    console: ").append(toIndentedString(console)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalConfiguration: ").append(toIndentedString(externalConfiguration)).append("\n");
    sb.append("    flavour: ").append(toIndentedString(flavour)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    healthState: ").append(toIndentedString(healthState)).append("\n");
    sb.append("    identityProviders: ").append(toIndentedString(identityProviders)).append("\n");
    sb.append("    ingresses: ").append(toIndentedString(ingresses)).append("\n");
    sb.append("    loadBalancerQuota: ").append(toIndentedString(loadBalancerQuota)).append("\n");
    sb.append("    machinePools: ").append(toIndentedString(machinePools)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    openshiftVersion: ").append(toIndentedString(openshiftVersion)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    provisionShard: ").append(toIndentedString(provisionShard)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
