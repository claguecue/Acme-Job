<%@page language="java"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>
<acme:list>
<acme:list-column code="authenticated.offer.list.label.title" path="title" width="20%"/>
<acme:list-column code="authenticated.offer.list.label.creationMoment" path="creationMoment" width="20%"/>
<acme:list-column code="authenticated.offer.list.label.limitDate" path="limitDate" width="20%"/>
<acme:list-column code="authenticated.offer.list.label.descriptionText" path="descriptionText" width="10%"/>
<acme:list-column code="authenticated.offer.list.label.amount" path="amount" width="10%"/>
<acme:list-column code="authenticated.offer.list.label.ticker" path="ticker" width="10%"/>


</acme:list>