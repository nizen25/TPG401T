<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : memberXSLTFile.xsl
    Created on : 22 May 2018, 8:49 AM
    Author     : Katlego
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <xsl:apply-templates select="member">
        </xsl:apply-templates>
    </xsl:template>
    <xsl:template match="member">
        <citizen>
            <id><xsl:value-of select="id"/></id>
            <firstName><xsl:value-of select="name"/></firstName>
            <lastName><xsl:value-of select="surname"/></lastName>
            <xsl:apply-templates select="cells"/>
            <xsl:apply-templates select="emails"/>
            <xsl:apply-templates select="address"/>
            <username><xsl:value-of select="username"/></username>
            <historyDate><xsl:value-of select="historyDate"/></historyDate>
            <password><xsl:value-of select="password"/></password>
        </citizen>
    </xsl:template>
    <xsl:template match="cells">
        <cellphoneNo>
            <cellphoneNo><xsl:value-of select="cells"/></cellphoneNo>
        </cellphoneNo>
    </xsl:template>
    <xsl:template match="emails">
        <citizenEmails>
            <emailAddress><xsl:value-of select="emails"/></emailAddress>
        </citizenEmails>
    </xsl:template>
    <xsl:template match="address">
        <address>
            <streetAddress><xsl:value-of select="street"/></streetAddress>
            <location><xsl:value-of select="area"/></location>
            <areaCode><xsl:value-of select="code"/></areaCode>
        </address>
    </xsl:template>
</xsl:stylesheet>
