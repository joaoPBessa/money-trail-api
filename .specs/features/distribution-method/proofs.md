# distribution-method proofs

**HEAD**: e88b23d
**Tree**: clean
**Shell**: C:/Program Files/Git\bin\bash.exe
**Result**: 29 pass, 0 fail

| Check | Proof | Result |
| --- | --- | --- |
| C1 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_savesAndReturnsMethod_whenVali` | pass |
| C2 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsInvalid_whenPercentagesD` | pass |
| C3 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsDuplicate_whenTitleExist` | pass |
| C4 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findAll_returnsAllOrderedByCreatedAtA` | pass |
| C5 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findById_returnsMethod_whenExists` | pass |
| C6 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findById_throwsNotFound_whenIdMissing` | pass |
| C7 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_savesChangesAndReturnsMethod_w` | pass |
| C8 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsNotFound_whenIdMissing` | pass |
| C9 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsDuplicate_whenTitleUsedB` | pass |
| C10 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_allowsSameMethodKeepingItsOwnT` | pass |
| C11 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsInvalid_whenPercentagesD` | pass |
| C12 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#delete_removesMethod_whenExists` | pass |
| C13 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#delete_throwsNotFound_whenIdMissing` | pass |
| C14 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns201WithLocatio` | pass |
| C15 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenTitleB` | pass |
| C16 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenPercen` | pass |
| C17 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenServic` | pass |
| C18 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns409_whenServic` | pass |
| C19 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#listMethods_returns200WithEmptyArr` | pass |
| C20 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#getMethod_returns404_whenServiceTh` | pass |
| C21 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#updateMethod_returns200WithUpdated` | pass |
| C22 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#deleteMethod_returns204_whenServic` | pass |
| C23 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#getMethod_returns200WithBody_whenE` | pass |
| C24 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#updateMethod_returns404_whenServic` | pass |
| C25 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#updateMethod_returns409_whenServic` | pass |
| C26 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#deleteMethod_returns404_whenServic` | pass |
| C27 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsInvalid_whenPercentageOu` | pass |
| C28 | `./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsDuplicate_whenTitleDiffe` | pass |
| Build | `./mvnw -B verify` | pass |

## Output

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_savesAndReturnsMethod_whenVali` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsInvalid_whenPercentagesD` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsDuplicate_whenTitleExist` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findAll_returnsAllOrderedByCreatedAtA` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findById_returnsMethod_whenExists` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#findById_throwsNotFound_whenIdMissing` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_savesChangesAndReturnsMethod_w` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsNotFound_whenIdMissing` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsDuplicate_whenTitleUsedB` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_allowsSameMethodKeepingItsOwnT` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#update_throwsInvalid_whenPercentagesD` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#delete_removesMethod_whenExists` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#delete_throwsNotFound_whenIdMissing` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns201WithLocatio` - exit 0

```
14:46:04.682 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:46:04.937 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:46:04.939 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:46:04.942 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenTitleB` - exit 0

```
14:46:14.643 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:46:14.909 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:46:14.910 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:46:14.914 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
14:46:15.133 [main] WARN org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver -- Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.distributionmethod.dto.DistributionMethodResponse> com.moneytrail.api.distributionmethod.DistributionMethodController.create(com.moneytrail.api.distributionmethod.dto.DistributionMethodRequest): [Field error in object 'distributionMethodRequest' on field 'title': rejected value [ ]; codes [NotBlank.distributionMethodRequest.title,NotBlank.title,NotBlank.java.lang.String,NotBlank]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [distributionMethodRequest.title,title]; arguments []; default message [title]]; default message [must not be blank]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenPercen` - exit 0

```
14:46:23.877 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:46:24.134 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:46:24.136 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:46:24.140 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
14:46:24.364 [main] WARN org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver -- Resolved [org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.moneytrail.api.distributionmethod.dto.DistributionMethodResponse> com.moneytrail.api.distributionmethod.DistributionMethodController.create(com.moneytrail.api.distributionmethod.dto.DistributionMethodRequest): [Field error in object 'distributionMethodRequest' on field 'spendPercentage': rejected value [101]; codes [Max.distributionMethodRequest.spendPercentage,Max.spendPercentage,Max.java.lang.Integer,Max]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [distributionMethodRequest.spendPercentage,spendPercentage]; arguments []; default message [spendPercentage],100]; default message [must be less than or equal to 100]] ]
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns400_whenServic` - exit 0

```
14:46:33.233 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:46:33.522 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:46:33.524 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:46:33.527 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#createMethod_returns409_whenServic` - exit 0

```
14:46:43.059 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:46:43.344 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:46:43.345 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:46:43.350 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#listMethods_returns200WithEmptyArr` - exit 0

```
14:46:51.270 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:46:51.533 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:46:51.534 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:46:51.538 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#getMethod_returns404_whenServiceTh` - exit 0

```
14:47:00.231 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:47:00.533 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:47:00.535 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:47:00.537 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 1 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#updateMethod_returns200WithUpdated` - exit 0

```
14:47:08.779 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:47:09.058 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:47:09.060 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:47:09.064 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 0 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#deleteMethod_returns204_whenServic` - exit 0

```
14:47:18.223 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:47:18.509 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:47:18.511 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:47:18.515 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#getMethod_returns200WithBody_whenE` - exit 0

```
14:47:27.321 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:47:27.603 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:47:27.604 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:47:27.608 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 2 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#updateMethod_returns404_whenServic` - exit 0

```
14:47:36.365 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:47:36.674 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:47:36.675 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:47:36.679 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#updateMethod_returns409_whenServic` - exit 0

```
14:47:45.987 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:47:46.267 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:47:46.269 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:47:46.275 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 3 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodControllerTest#deleteMethod_returns404_whenServic` - exit 0

```
14:47:54.181 [main] INFO org.hibernate.validator.internal.util.Version -- HV000001: Hibernate Validator 9.1.6.Final
14:47:54.481 [main] INFO org.springframework.mock.web.MockServletContext -- Initializing Spring TestDispatcherServlet ''
14:47:54.482 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Initializing Servlet ''
14:47:54.486 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet -- Completed initialization in 1 ms
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsInvalid_whenPercentageOu` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```

`./mvnw -q test -DfailIfNoTests=true -Dtest=DistributionMethodServiceTest#create_throwsDuplicate_whenTitleDiffe` - exit 0

```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: A Java agent has been loaded dynamically (C:\Users\joaob\.m2\repository\net\bytebuddy\byte-buddy-agent\1.18.17\byte-buddy-agent-1.18.17.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
```
