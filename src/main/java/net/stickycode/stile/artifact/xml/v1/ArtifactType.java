//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.29 at 10:29:57 PM NZST 
//


package net.stickycode.stile.artifact.xml.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArtifactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArtifactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="packaging" type="{http://schema.stickycode.net/Stile/Artifact/v1}ArtifactReferenceType"/>
 *         &lt;element name="project" type="{http://schema.stickycode.net/Stile/Artifact/v1}ArtifactReferenceType"/>
 *         &lt;element name="dependencies" type="{http://schema.stickycode.net/Stile/Artifact/v1}DependenciesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArtifactType", propOrder = {
    "group",
    "id",
    "version",
    "packaging",
    "project",
    "dependencies"
})
public class ArtifactType {

    @XmlElement(required = true)
    protected String group;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected ArtifactReferenceType packaging;
    @XmlElement(required = true)
    protected ArtifactReferenceType project;
    @XmlElement(required = true)
    protected DependenciesType dependencies;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactReferenceType }
     *     
     */
    public ArtifactReferenceType getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactReferenceType }
     *     
     */
    public void setPackaging(ArtifactReferenceType value) {
        this.packaging = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactReferenceType }
     *     
     */
    public ArtifactReferenceType getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactReferenceType }
     *     
     */
    public void setProject(ArtifactReferenceType value) {
        this.project = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link DependenciesType }
     *     
     */
    public DependenciesType getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependenciesType }
     *     
     */
    public void setDependencies(DependenciesType value) {
        this.dependencies = value;
    }

}