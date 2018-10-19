/*
 * MercadoLibre API
 * MercadoLibre API Documentation.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Descriptions;
import io.swagger.client.model.Geolocation;
import io.swagger.client.model.ItemResponseAttributes;
import io.swagger.client.model.ItemResponsePictures;
import io.swagger.client.model.Location;
import io.swagger.client.model.SaleTerms;
import io.swagger.client.model.SellerAddress;
import io.swagger.client.model.Shipping;
import io.swagger.client.model.Variations;
import io.swagger.client.model.Warnings;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class ItemResponse {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("site_id")
  private String siteId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("subtitle")
  private Object subtitle = null;

  @JsonProperty("seller_id")
  private Integer sellerId = null;

  @JsonProperty("category_id")
  private String categoryId = null;

  @JsonProperty("official_store_id")
  private Object officialStoreId = null;

  @JsonProperty("price")
  private Integer price = null;

  @JsonProperty("base_price")
  private Integer basePrice = null;

  @JsonProperty("original_price")
  private Object originalPrice = null;

  @JsonProperty("currency_id")
  private String currencyId = null;

  @JsonProperty("initial_quantity")
  private Integer initialQuantity = null;

  @JsonProperty("available_quantity")
  private Integer availableQuantity = null;

  @JsonProperty("sold_quantity")
  private Integer soldQuantity = null;

  @JsonProperty("sale_terms")
  private List<SaleTerms> saleTerms = null;

  @JsonProperty("buying_mode")
  private String buyingMode = null;

  @JsonProperty("listing_type_id")
  private String listingTypeId = null;

  @JsonProperty("start_time")
  private String startTime = null;

  @JsonProperty("stop_time")
  private String stopTime = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("expiration_time")
  private String expirationTime = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("permalink")
  private String permalink = null;

  @JsonProperty("pictures")
  private List<ItemResponsePictures> pictures = null;

  @JsonProperty("video_id")
  private String videoId = null;

  @JsonProperty("descriptions")
  private List<Descriptions> descriptions = null;

  @JsonProperty("accepts_mercadopago")
  private Boolean acceptsMercadopago = null;

  @JsonProperty("non_mercado_pago_payment_methods")
  private List<String> nonMercadoPagoPaymentMethods = null;

  @JsonProperty("shipping")
  private Shipping shipping = null;

  @JsonProperty("international_delivery_mode")
  private String internationalDeliveryMode = null;

  @JsonProperty("seller_address")
  private SellerAddress sellerAddress = null;

  @JsonProperty("seller_contact")
  private Object sellerContact = null;

  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("geolocation")
  private Geolocation geolocation = null;

  @JsonProperty("attributes")
  private List<ItemResponseAttributes> attributes = null;

  @JsonProperty("warnings")
  private List<Warnings> warnings = null;

  @JsonProperty("listing_source")
  private String listingSource = null;

  @JsonProperty("variations")
  private List<Variations> variations = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  @JsonProperty("secure_thumbnail")
  private String secureThumbnail = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("sub_status")
  private List<String> subStatus = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("warranty")
  private String warranty = null;

  @JsonProperty("catalog_product_id")
  private Object catalogProductId = null;

  @JsonProperty("domain_id")
  private Object domainId = null;

  @JsonProperty("seller_custom_field")
  private Object sellerCustomField = null;

  @JsonProperty("parent_item_id")
  private Object parentItemId = null;

  @JsonProperty("differential_pricing")
  private Object differentialPricing = null;

  @JsonProperty("deal_ids")
  private List<String> dealIds = null;

  @JsonProperty("automatic_relist")
  private Boolean automaticRelist = null;

  @JsonProperty("date_created")
  private String dateCreated = null;

  @JsonProperty("last_updated")
  private String lastUpdated = null;

  @JsonProperty("health")
  private Object health = null;

  public ItemResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemResponse siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(value = "")
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public ItemResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ItemResponse subtitle(Object subtitle) {
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Get subtitle
   * @return subtitle
  **/
  @ApiModelProperty(value = "")
  public Object getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(Object subtitle) {
    this.subtitle = subtitle;
  }

  public ItemResponse sellerId(Integer sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * Get sellerId
   * @return sellerId
  **/
  @ApiModelProperty(value = "")
  public Integer getSellerId() {
    return sellerId;
  }

  public void setSellerId(Integer sellerId) {
    this.sellerId = sellerId;
  }

  public ItemResponse categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(value = "")
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public ItemResponse officialStoreId(Object officialStoreId) {
    this.officialStoreId = officialStoreId;
    return this;
  }

   /**
   * Get officialStoreId
   * @return officialStoreId
  **/
  @ApiModelProperty(value = "")
  public Object getOfficialStoreId() {
    return officialStoreId;
  }

  public void setOfficialStoreId(Object officialStoreId) {
    this.officialStoreId = officialStoreId;
  }

  public ItemResponse price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public ItemResponse basePrice(Integer basePrice) {
    this.basePrice = basePrice;
    return this;
  }

   /**
   * Get basePrice
   * @return basePrice
  **/
  @ApiModelProperty(value = "")
  public Integer getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(Integer basePrice) {
    this.basePrice = basePrice;
  }

  public ItemResponse originalPrice(Object originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * Get originalPrice
   * @return originalPrice
  **/
  @ApiModelProperty(value = "")
  public Object getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(Object originalPrice) {
    this.originalPrice = originalPrice;
  }

  public ItemResponse currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * Get currencyId
   * @return currencyId
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public ItemResponse initialQuantity(Integer initialQuantity) {
    this.initialQuantity = initialQuantity;
    return this;
  }

   /**
   * Get initialQuantity
   * @return initialQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getInitialQuantity() {
    return initialQuantity;
  }

  public void setInitialQuantity(Integer initialQuantity) {
    this.initialQuantity = initialQuantity;
  }

  public ItemResponse availableQuantity(Integer availableQuantity) {
    this.availableQuantity = availableQuantity;
    return this;
  }

   /**
   * Get availableQuantity
   * @return availableQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailableQuantity() {
    return availableQuantity;
  }

  public void setAvailableQuantity(Integer availableQuantity) {
    this.availableQuantity = availableQuantity;
  }

  public ItemResponse soldQuantity(Integer soldQuantity) {
    this.soldQuantity = soldQuantity;
    return this;
  }

   /**
   * Get soldQuantity
   * @return soldQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getSoldQuantity() {
    return soldQuantity;
  }

  public void setSoldQuantity(Integer soldQuantity) {
    this.soldQuantity = soldQuantity;
  }

  public ItemResponse saleTerms(List<SaleTerms> saleTerms) {
    this.saleTerms = saleTerms;
    return this;
  }

  public ItemResponse addSaleTermsItem(SaleTerms saleTermsItem) {
    if (this.saleTerms == null) {
      this.saleTerms = new ArrayList<SaleTerms>();
    }
    this.saleTerms.add(saleTermsItem);
    return this;
  }

   /**
   * Get saleTerms
   * @return saleTerms
  **/
  @ApiModelProperty(value = "")
  public List<SaleTerms> getSaleTerms() {
    return saleTerms;
  }

  public void setSaleTerms(List<SaleTerms> saleTerms) {
    this.saleTerms = saleTerms;
  }

  public ItemResponse buyingMode(String buyingMode) {
    this.buyingMode = buyingMode;
    return this;
  }

   /**
   * Get buyingMode
   * @return buyingMode
  **/
  @ApiModelProperty(value = "")
  public String getBuyingMode() {
    return buyingMode;
  }

  public void setBuyingMode(String buyingMode) {
    this.buyingMode = buyingMode;
  }

  public ItemResponse listingTypeId(String listingTypeId) {
    this.listingTypeId = listingTypeId;
    return this;
  }

   /**
   * Get listingTypeId
   * @return listingTypeId
  **/
  @ApiModelProperty(value = "")
  public String getListingTypeId() {
    return listingTypeId;
  }

  public void setListingTypeId(String listingTypeId) {
    this.listingTypeId = listingTypeId;
  }

  public ItemResponse startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public ItemResponse stopTime(String stopTime) {
    this.stopTime = stopTime;
    return this;
  }

   /**
   * Get stopTime
   * @return stopTime
  **/
  @ApiModelProperty(value = "")
  public String getStopTime() {
    return stopTime;
  }

  public void setStopTime(String stopTime) {
    this.stopTime = stopTime;
  }

  public ItemResponse endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public ItemResponse expirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Get expirationTime
   * @return expirationTime
  **/
  @ApiModelProperty(value = "")
  public String getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }

  public ItemResponse condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @ApiModelProperty(value = "")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public ItemResponse permalink(String permalink) {
    this.permalink = permalink;
    return this;
  }

   /**
   * Get permalink
   * @return permalink
  **/
  @ApiModelProperty(value = "")
  public String getPermalink() {
    return permalink;
  }

  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }

  public ItemResponse pictures(List<ItemResponsePictures> pictures) {
    this.pictures = pictures;
    return this;
  }

  public ItemResponse addPicturesItem(ItemResponsePictures picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<ItemResponsePictures>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Get pictures
   * @return pictures
  **/
  @ApiModelProperty(value = "")
  public List<ItemResponsePictures> getPictures() {
    return pictures;
  }

  public void setPictures(List<ItemResponsePictures> pictures) {
    this.pictures = pictures;
  }

  public ItemResponse videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * Get videoId
   * @return videoId
  **/
  @ApiModelProperty(value = "")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public ItemResponse descriptions(List<Descriptions> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public ItemResponse addDescriptionsItem(Descriptions descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<Descriptions>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * Get descriptions
   * @return descriptions
  **/
  @ApiModelProperty(value = "")
  public List<Descriptions> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<Descriptions> descriptions) {
    this.descriptions = descriptions;
  }

  public ItemResponse acceptsMercadopago(Boolean acceptsMercadopago) {
    this.acceptsMercadopago = acceptsMercadopago;
    return this;
  }

   /**
   * Get acceptsMercadopago
   * @return acceptsMercadopago
  **/
  @ApiModelProperty(value = "")
  public Boolean isAcceptsMercadopago() {
    return acceptsMercadopago;
  }

  public void setAcceptsMercadopago(Boolean acceptsMercadopago) {
    this.acceptsMercadopago = acceptsMercadopago;
  }

  public ItemResponse nonMercadoPagoPaymentMethods(List<String> nonMercadoPagoPaymentMethods) {
    this.nonMercadoPagoPaymentMethods = nonMercadoPagoPaymentMethods;
    return this;
  }

  public ItemResponse addNonMercadoPagoPaymentMethodsItem(String nonMercadoPagoPaymentMethodsItem) {
    if (this.nonMercadoPagoPaymentMethods == null) {
      this.nonMercadoPagoPaymentMethods = new ArrayList<String>();
    }
    this.nonMercadoPagoPaymentMethods.add(nonMercadoPagoPaymentMethodsItem);
    return this;
  }

   /**
   * Get nonMercadoPagoPaymentMethods
   * @return nonMercadoPagoPaymentMethods
  **/
  @ApiModelProperty(value = "")
  public List<String> getNonMercadoPagoPaymentMethods() {
    return nonMercadoPagoPaymentMethods;
  }

  public void setNonMercadoPagoPaymentMethods(List<String> nonMercadoPagoPaymentMethods) {
    this.nonMercadoPagoPaymentMethods = nonMercadoPagoPaymentMethods;
  }

  public ItemResponse shipping(Shipping shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @ApiModelProperty(value = "")
  public Shipping getShipping() {
    return shipping;
  }

  public void setShipping(Shipping shipping) {
    this.shipping = shipping;
  }

  public ItemResponse internationalDeliveryMode(String internationalDeliveryMode) {
    this.internationalDeliveryMode = internationalDeliveryMode;
    return this;
  }

   /**
   * Get internationalDeliveryMode
   * @return internationalDeliveryMode
  **/
  @ApiModelProperty(value = "")
  public String getInternationalDeliveryMode() {
    return internationalDeliveryMode;
  }

  public void setInternationalDeliveryMode(String internationalDeliveryMode) {
    this.internationalDeliveryMode = internationalDeliveryMode;
  }

  public ItemResponse sellerAddress(SellerAddress sellerAddress) {
    this.sellerAddress = sellerAddress;
    return this;
  }

   /**
   * Get sellerAddress
   * @return sellerAddress
  **/
  @ApiModelProperty(value = "")
  public SellerAddress getSellerAddress() {
    return sellerAddress;
  }

  public void setSellerAddress(SellerAddress sellerAddress) {
    this.sellerAddress = sellerAddress;
  }

  public ItemResponse sellerContact(Object sellerContact) {
    this.sellerContact = sellerContact;
    return this;
  }

   /**
   * Get sellerContact
   * @return sellerContact
  **/
  @ApiModelProperty(value = "")
  public Object getSellerContact() {
    return sellerContact;
  }

  public void setSellerContact(Object sellerContact) {
    this.sellerContact = sellerContact;
  }

  public ItemResponse location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public ItemResponse geolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }

   /**
   * Get geolocation
   * @return geolocation
  **/
  @ApiModelProperty(value = "")
  public Geolocation getGeolocation() {
    return geolocation;
  }

  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  public ItemResponse attributes(List<ItemResponseAttributes> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ItemResponse addAttributesItem(ItemResponseAttributes attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<ItemResponseAttributes>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public List<ItemResponseAttributes> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<ItemResponseAttributes> attributes) {
    this.attributes = attributes;
  }

  public ItemResponse warnings(List<Warnings> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ItemResponse addWarningsItem(Warnings warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<Warnings>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(value = "")
  public List<Warnings> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<Warnings> warnings) {
    this.warnings = warnings;
  }

  public ItemResponse listingSource(String listingSource) {
    this.listingSource = listingSource;
    return this;
  }

   /**
   * Get listingSource
   * @return listingSource
  **/
  @ApiModelProperty(value = "")
  public String getListingSource() {
    return listingSource;
  }

  public void setListingSource(String listingSource) {
    this.listingSource = listingSource;
  }

  public ItemResponse variations(List<Variations> variations) {
    this.variations = variations;
    return this;
  }

  public ItemResponse addVariationsItem(Variations variationsItem) {
    if (this.variations == null) {
      this.variations = new ArrayList<Variations>();
    }
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * Get variations
   * @return variations
  **/
  @ApiModelProperty(value = "")
  public List<Variations> getVariations() {
    return variations;
  }

  public void setVariations(List<Variations> variations) {
    this.variations = variations;
  }

  public ItemResponse thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(value = "")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public ItemResponse secureThumbnail(String secureThumbnail) {
    this.secureThumbnail = secureThumbnail;
    return this;
  }

   /**
   * Get secureThumbnail
   * @return secureThumbnail
  **/
  @ApiModelProperty(value = "")
  public String getSecureThumbnail() {
    return secureThumbnail;
  }

  public void setSecureThumbnail(String secureThumbnail) {
    this.secureThumbnail = secureThumbnail;
  }

  public ItemResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ItemResponse subStatus(List<String> subStatus) {
    this.subStatus = subStatus;
    return this;
  }

  public ItemResponse addSubStatusItem(String subStatusItem) {
    if (this.subStatus == null) {
      this.subStatus = new ArrayList<String>();
    }
    this.subStatus.add(subStatusItem);
    return this;
  }

   /**
   * Get subStatus
   * @return subStatus
  **/
  @ApiModelProperty(value = "")
  public List<String> getSubStatus() {
    return subStatus;
  }

  public void setSubStatus(List<String> subStatus) {
    this.subStatus = subStatus;
  }

  public ItemResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ItemResponse addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ItemResponse warranty(String warranty) {
    this.warranty = warranty;
    return this;
  }

   /**
   * Get warranty
   * @return warranty
  **/
  @ApiModelProperty(value = "")
  public String getWarranty() {
    return warranty;
  }

  public void setWarranty(String warranty) {
    this.warranty = warranty;
  }

  public ItemResponse catalogProductId(Object catalogProductId) {
    this.catalogProductId = catalogProductId;
    return this;
  }

   /**
   * Get catalogProductId
   * @return catalogProductId
  **/
  @ApiModelProperty(value = "")
  public Object getCatalogProductId() {
    return catalogProductId;
  }

  public void setCatalogProductId(Object catalogProductId) {
    this.catalogProductId = catalogProductId;
  }

  public ItemResponse domainId(Object domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   * Get domainId
   * @return domainId
  **/
  @ApiModelProperty(value = "")
  public Object getDomainId() {
    return domainId;
  }

  public void setDomainId(Object domainId) {
    this.domainId = domainId;
  }

  public ItemResponse sellerCustomField(Object sellerCustomField) {
    this.sellerCustomField = sellerCustomField;
    return this;
  }

   /**
   * Get sellerCustomField
   * @return sellerCustomField
  **/
  @ApiModelProperty(value = "")
  public Object getSellerCustomField() {
    return sellerCustomField;
  }

  public void setSellerCustomField(Object sellerCustomField) {
    this.sellerCustomField = sellerCustomField;
  }

  public ItemResponse parentItemId(Object parentItemId) {
    this.parentItemId = parentItemId;
    return this;
  }

   /**
   * Get parentItemId
   * @return parentItemId
  **/
  @ApiModelProperty(value = "")
  public Object getParentItemId() {
    return parentItemId;
  }

  public void setParentItemId(Object parentItemId) {
    this.parentItemId = parentItemId;
  }

  public ItemResponse differentialPricing(Object differentialPricing) {
    this.differentialPricing = differentialPricing;
    return this;
  }

   /**
   * Get differentialPricing
   * @return differentialPricing
  **/
  @ApiModelProperty(value = "")
  public Object getDifferentialPricing() {
    return differentialPricing;
  }

  public void setDifferentialPricing(Object differentialPricing) {
    this.differentialPricing = differentialPricing;
  }

  public ItemResponse dealIds(List<String> dealIds) {
    this.dealIds = dealIds;
    return this;
  }

  public ItemResponse addDealIdsItem(String dealIdsItem) {
    if (this.dealIds == null) {
      this.dealIds = new ArrayList<String>();
    }
    this.dealIds.add(dealIdsItem);
    return this;
  }

   /**
   * Get dealIds
   * @return dealIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getDealIds() {
    return dealIds;
  }

  public void setDealIds(List<String> dealIds) {
    this.dealIds = dealIds;
  }

  public ItemResponse automaticRelist(Boolean automaticRelist) {
    this.automaticRelist = automaticRelist;
    return this;
  }

   /**
   * Get automaticRelist
   * @return automaticRelist
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutomaticRelist() {
    return automaticRelist;
  }

  public void setAutomaticRelist(Boolean automaticRelist) {
    this.automaticRelist = automaticRelist;
  }

  public ItemResponse dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @ApiModelProperty(value = "")
  public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public ItemResponse lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ItemResponse health(Object health) {
    this.health = health;
    return this;
  }

   /**
   * Get health
   * @return health
  **/
  @ApiModelProperty(value = "")
  public Object getHealth() {
    return health;
  }

  public void setHealth(Object health) {
    this.health = health;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResponse itemResponse = (ItemResponse) o;
    return Objects.equals(this.id, itemResponse.id) &&
        Objects.equals(this.siteId, itemResponse.siteId) &&
        Objects.equals(this.title, itemResponse.title) &&
        Objects.equals(this.subtitle, itemResponse.subtitle) &&
        Objects.equals(this.sellerId, itemResponse.sellerId) &&
        Objects.equals(this.categoryId, itemResponse.categoryId) &&
        Objects.equals(this.officialStoreId, itemResponse.officialStoreId) &&
        Objects.equals(this.price, itemResponse.price) &&
        Objects.equals(this.basePrice, itemResponse.basePrice) &&
        Objects.equals(this.originalPrice, itemResponse.originalPrice) &&
        Objects.equals(this.currencyId, itemResponse.currencyId) &&
        Objects.equals(this.initialQuantity, itemResponse.initialQuantity) &&
        Objects.equals(this.availableQuantity, itemResponse.availableQuantity) &&
        Objects.equals(this.soldQuantity, itemResponse.soldQuantity) &&
        Objects.equals(this.saleTerms, itemResponse.saleTerms) &&
        Objects.equals(this.buyingMode, itemResponse.buyingMode) &&
        Objects.equals(this.listingTypeId, itemResponse.listingTypeId) &&
        Objects.equals(this.startTime, itemResponse.startTime) &&
        Objects.equals(this.stopTime, itemResponse.stopTime) &&
        Objects.equals(this.endTime, itemResponse.endTime) &&
        Objects.equals(this.expirationTime, itemResponse.expirationTime) &&
        Objects.equals(this.condition, itemResponse.condition) &&
        Objects.equals(this.permalink, itemResponse.permalink) &&
        Objects.equals(this.pictures, itemResponse.pictures) &&
        Objects.equals(this.videoId, itemResponse.videoId) &&
        Objects.equals(this.descriptions, itemResponse.descriptions) &&
        Objects.equals(this.acceptsMercadopago, itemResponse.acceptsMercadopago) &&
        Objects.equals(this.nonMercadoPagoPaymentMethods, itemResponse.nonMercadoPagoPaymentMethods) &&
        Objects.equals(this.shipping, itemResponse.shipping) &&
        Objects.equals(this.internationalDeliveryMode, itemResponse.internationalDeliveryMode) &&
        Objects.equals(this.sellerAddress, itemResponse.sellerAddress) &&
        Objects.equals(this.sellerContact, itemResponse.sellerContact) &&
        Objects.equals(this.location, itemResponse.location) &&
        Objects.equals(this.geolocation, itemResponse.geolocation) &&
        Objects.equals(this.attributes, itemResponse.attributes) &&
        Objects.equals(this.warnings, itemResponse.warnings) &&
        Objects.equals(this.listingSource, itemResponse.listingSource) &&
        Objects.equals(this.variations, itemResponse.variations) &&
        Objects.equals(this.thumbnail, itemResponse.thumbnail) &&
        Objects.equals(this.secureThumbnail, itemResponse.secureThumbnail) &&
        Objects.equals(this.status, itemResponse.status) &&
        Objects.equals(this.subStatus, itemResponse.subStatus) &&
        Objects.equals(this.tags, itemResponse.tags) &&
        Objects.equals(this.warranty, itemResponse.warranty) &&
        Objects.equals(this.catalogProductId, itemResponse.catalogProductId) &&
        Objects.equals(this.domainId, itemResponse.domainId) &&
        Objects.equals(this.sellerCustomField, itemResponse.sellerCustomField) &&
        Objects.equals(this.parentItemId, itemResponse.parentItemId) &&
        Objects.equals(this.differentialPricing, itemResponse.differentialPricing) &&
        Objects.equals(this.dealIds, itemResponse.dealIds) &&
        Objects.equals(this.automaticRelist, itemResponse.automaticRelist) &&
        Objects.equals(this.dateCreated, itemResponse.dateCreated) &&
        Objects.equals(this.lastUpdated, itemResponse.lastUpdated) &&
        Objects.equals(this.health, itemResponse.health);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, title, subtitle, sellerId, categoryId, officialStoreId, price, basePrice, originalPrice, currencyId, initialQuantity, availableQuantity, soldQuantity, saleTerms, buyingMode, listingTypeId, startTime, stopTime, endTime, expirationTime, condition, permalink, pictures, videoId, descriptions, acceptsMercadopago, nonMercadoPagoPaymentMethods, shipping, internationalDeliveryMode, sellerAddress, sellerContact, location, geolocation, attributes, warnings, listingSource, variations, thumbnail, secureThumbnail, status, subStatus, tags, warranty, catalogProductId, domainId, sellerCustomField, parentItemId, differentialPricing, dealIds, automaticRelist, dateCreated, lastUpdated, health);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    officialStoreId: ").append(toIndentedString(officialStoreId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    initialQuantity: ").append(toIndentedString(initialQuantity)).append("\n");
    sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
    sb.append("    soldQuantity: ").append(toIndentedString(soldQuantity)).append("\n");
    sb.append("    saleTerms: ").append(toIndentedString(saleTerms)).append("\n");
    sb.append("    buyingMode: ").append(toIndentedString(buyingMode)).append("\n");
    sb.append("    listingTypeId: ").append(toIndentedString(listingTypeId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    acceptsMercadopago: ").append(toIndentedString(acceptsMercadopago)).append("\n");
    sb.append("    nonMercadoPagoPaymentMethods: ").append(toIndentedString(nonMercadoPagoPaymentMethods)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    internationalDeliveryMode: ").append(toIndentedString(internationalDeliveryMode)).append("\n");
    sb.append("    sellerAddress: ").append(toIndentedString(sellerAddress)).append("\n");
    sb.append("    sellerContact: ").append(toIndentedString(sellerContact)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    listingSource: ").append(toIndentedString(listingSource)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    secureThumbnail: ").append(toIndentedString(secureThumbnail)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    warranty: ").append(toIndentedString(warranty)).append("\n");
    sb.append("    catalogProductId: ").append(toIndentedString(catalogProductId)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    sellerCustomField: ").append(toIndentedString(sellerCustomField)).append("\n");
    sb.append("    parentItemId: ").append(toIndentedString(parentItemId)).append("\n");
    sb.append("    differentialPricing: ").append(toIndentedString(differentialPricing)).append("\n");
    sb.append("    dealIds: ").append(toIndentedString(dealIds)).append("\n");
    sb.append("    automaticRelist: ").append(toIndentedString(automaticRelist)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
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

