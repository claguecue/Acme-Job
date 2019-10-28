
<%--
- list.jsp
-
- Copyright (c) 2019 Aureliano Piqueras, based on Rafael Corchuelo's DP Starter project.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="authenticated.challenge.list.label.title" path="title" width="15%"/>
	<acme:list-column code="authenticated.challenge.list.label.deadline" path="deadline" width="10%"/>
	<acme:list-column code="authenticated.challenge.list.label.description" path="description" width="15%"/>
	<acme:list-column code="authenticated.challenge.list.label.goldGoal" path="goldGoal" width="10%"/>
	<acme:list-column code="authenticated.challenge.list.label.goldReward" path="goldReward" width="10%"/>
	<acme:list-column code="authenticated.challenge.list.label.silverGoal" path="silverGoal" width="10%"/>
	<acme:list-column code="authenticated.challenge.list.label.silverReward" path="silverReward" width="10%"/>
	<acme:list-column code="authenticated.challenge.list.label.bronzeGoal" path="bronzeGoal" width="10%"/>
	<acme:list-column code="authenticated.challenge.list.label.bronzeReward" path="bronzeReward" width="10%"/>
</acme:list>


