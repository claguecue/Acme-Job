/*
 * AdministratorAcmeRequestController.java
 *
 * Copyright (c) 2019 Aureliano Piqueras, based on Rafael Corchuelo's DP Starter project.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.administrator.customization;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.components.CustomCommand;
import acme.entities.customizations.Customization;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Administrator;

@Controller
@RequestMapping("/administrator/customization/")
public class AdministratorCustomizationController extends AbstractController<Administrator, Customization> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AdministratorCustomizationListService		listService;
	@Autowired
	private AdministratorCustomizationShowService		showService;
	@Autowired
	private AdministratorCustomizationListMainService	listMainService;
	@Autowired
	private AdministratorCustomizationDisplayService	displayService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addCustomCommand(CustomCommand.LIST_MAIN, BasicCommand.LIST, this.listMainService);
		super.addCustomCommand(CustomCommand.DISPLAY, BasicCommand.SHOW, this.displayService);
	}
}
