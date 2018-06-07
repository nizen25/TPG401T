<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : newstylesheet.xsl
    Created on : 15 May 2018, 11:13 PM
    Author     : sydney
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <xsl:apply-templates select="customer"/>
    </xsl:template>

    <xsl:template match="customer">
        <applicant>
            <id><xsl:value-of select="id"/></id>
            <name><xsl:value-of select="name"/></name>
            <surname><xsl:value-of select="surname"/></surname>
            <idNumber><xsl:value-of select="idNumber"/></idNumber>
            <loanAmount><xsl:value-of select="loanAmount"/></loanAmount>
        </applicant>
    </xsl:template>
</xsl:stylesheet>

