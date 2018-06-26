<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : delegateXsltFile.xsl
    Created on : June 1, 2018, 6:59 PM
    Author     : leseg
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <xsl:apply-templates select="userr"/>
    </xsl:template>
    
    <xsl:template match="/">
	<xsl:apply-templates select="userr"/>
	<clientt>
		<idno><xsl:value-of select="id"/></idno>
		<userName><xsl:value-of select="name"/></userName>
		<surname><xsl:value-of select="lastname"/></surname>
		<status><xsl:value-of select="status"/></status>
	</clientt>
	</xsl:template>
</xsl:stylesheet>