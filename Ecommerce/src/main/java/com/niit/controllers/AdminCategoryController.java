package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.models.Client;

@Controller
public class AdminCategoryController {

	

	// Mapping for the signup page
	   @RequestMapping(value = "/admin_home",method = RequestMethod.GET)
	   public ModelAndView triggerSignup(ModelMap model) {
	      return new ModelAndView("/misc/help", "command", new Client());
	   }
	 /**
	  * This method will add or update categories. It would first list all the categories and then
	  * allow user to add or update the categories. Use the hibernate method to add or update the model 
	  * instead of a plain add. 
	  * @param model
	  * @return
	  */
	   @RequestMapping(value = "/admin_add_category",method = RequestMethod.GET)
	   public ModelAndView add_category(ModelMap model) {
	      return new ModelAndView("/misc/help", "command", new Client());
	   }
	
	   /**
		  * This method will be used to save the category. This controller method would be 
		  * invoked to save the admin category and then the add method would be called. 
		  * @param model
		  * @return
		  */
		   @RequestMapping(value = "/admin_save_category",method = RequestMethod.GET)
		   public ModelAndView save_category(ModelMap model) {
		      return new ModelAndView("/misc/help", "command", new Client());
		   }
		
		   /**
			  * This method will be used to edit the category. This controller method would be 
			  * invoked to save the admin category and then the add method would be called. 
			  * @param model
			  * @return
			  */
			   @RequestMapping(value = "/admin_edit_category",method = RequestMethod.GET)
			   public ModelAndView edit_category(ModelMap model) {
			      return new ModelAndView("/misc/help", "command", new Client());
			   }
			
			   /**
				  * This method will be used to delete the category. This controller method would be 
				  * invoked to save the admin category and then the add page method would be called. 
				  * @param model
				  * @return
				  */
				   @RequestMapping(value = "/admin_delete_category",method = RequestMethod.GET)
				   public ModelAndView delete_category(ModelMap model) {
				      return new ModelAndView("/misc/help", "command", new Client());
				   }
				   
}
				/**
				 * The code below is a sample code for CRUD
				 */
				   
				/*   @RequestMapping(value = "/save", method = RequestMethod.POST)
				   public ModelAndView saveEmployee(@ModelAttribute("command")EmployeeBean employeeBean, 
				      BindingResult result) {
				     Employee employee = prepareModel(employeeBean);
				     employeeService.addEmployee(employee);
				     return new ModelAndView("redirect:/add.html");
				    }

				   @RequestMapping(value = "/add", method = RequestMethod.GET)
				   public ModelAndView addEmployee(@ModelAttribute("command")EmployeeBean employeeBean,
				     BindingResult result) {
				    Map<String, Object> model = new HashMap<String, Object>();
				    model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
				    return new ModelAndView("addEmployee", model);
				   }
				   
				   @RequestMapping(value = "/delete", method = RequestMethod.GET)
				   public ModelAndView editEmployee(@ModelAttribute("command")EmployeeBean employeeBean,
				      BindingResult result) {
				     employeeService.deleteEmployee(prepareModel(employeeBean));
				     Map<String, Object> model = new HashMap<String, Object>();
				     model.put("employee", null);
				     model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
				     return new ModelAndView("addEmployee", model);
				    }
				    
				   @RequestMapping(value = "/edit", method = RequestMethod.GET)
				   public ModelAndView deleteEmployee(@ModelAttribute("command")EmployeeBean employeeBean,
				      BindingResult result) {
				     Map<String, Object> model = new HashMap<String, Object>();
				     model.put("employee", prepareEmployeeBean(employeeService.getEmployee(employeeBean.getId())));
				     model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
				     return new ModelAndView("addEmployee", model);
				    }
				    
				    private Employee prepareModel(EmployeeBean employeeBean){
				     Employee employee = new Employee();
				     employee.setEmpAddress(employeeBean.getAddress());
				     employee.setEmpAge(employeeBean.getAge());
				     employee.setEmpName(employeeBean.getName());
				     employee.setSalary(employeeBean.getSalary());
				     employee.setEmpId(employeeBean.getId());
				     employeeBean.setId(null);
				     return employee;
				    }
				    
				    private List<EmployeeBean> prepareListofBean(List<Employee> employees){
				     List<employeebean> beans = null;
				     if(employees != null && !employees.isEmpty()){
				      beans = new ArrayList<EmployeeBean>();
				      EmployeeBean bean = null;
				      for(Employee employee : employees){
				       bean = new EmployeeBean();
				       bean.setName(employee.getEmpName());
				       bean.setId(employee.getEmpId());
				       bean.setAddress(employee.getEmpAddress());
				       bean.setSalary(employee.getSalary());
				       bean.setAge(employee.getEmpAge());
				       beans.add(bean);
				      }
				     }
				     return beans;
				    }
				    
				    private EmployeeBean prepareEmployeeBean(Employee employee){
				     EmployeeBean bean = new EmployeeBean();
				     bean.setAddress(employee.getEmpAddress());
				     bean.setAge(employee.getEmpAge());
				     bean.setName(employee.getEmpName());
				     bean.setSalary(employee.getSalary());
				     bean.setId(employee.getEmpId());
				     return bean;
				    }
				   }
	
	*/
	
	
	
	
	
	
	
	
	

