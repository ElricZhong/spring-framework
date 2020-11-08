/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context;

/**
 * Interface that encapsulates event publication functionality.
 *
 * 这个接口封装了推送事件的功能。
 *
 * <p>Serves as a super-interface for {@link ApplicationContext}.
 *
 * 为超接口ApplicationContext服务。
 *
 * @author Juergen Hoeller
 * @author Stephane Nicoll
 * @since 1.1.1
 * @see ApplicationContext
 * @see ApplicationEventPublisherAware
 * @see org.springframework.context.ApplicationEvent
 * @see org.springframework.context.event.ApplicationEventMulticaster
 * @see org.springframework.context.event.EventPublicationInterceptor
 */
@FunctionalInterface
public interface ApplicationEventPublisher {

	/**
	 * Notify all <strong>matching</strong> listeners registered with this
	 * application of an application event. Events may be framework events
	 * (such as ContextRefreshedEvent) or application-specific events.
	 *
	 * 通知所有注册到此应用的匹配的listener一个application event。事件可以是框架事件（例如ContextRefreshedEvent）或特定于应用的事件。
	 *
	 * <p>Such an event publication step is effectively a hand-off to the
	 * multicaster and does not imply synchronous/asynchronous execution
	 * or even immediate execution at all. Event listeners are encouraged
	 * to be as efficient as possible, individually using asynchronous
	 * execution for longer-running and potentially blocking operations.
	 *
	 * 这样的事件发布步骤实际上是切换到广播器，并且根本不意味着同步/异步执行，甚至立即执行。鼓励listener尽可能地高效，可以单独使用异步执行长时流程和一些阻塞操作。
	 *
	 * @param event the event to publish
	 * @see #publishEvent(Object)
	 * @see org.springframework.context.event.ContextRefreshedEvent
	 * @see org.springframework.context.event.ContextClosedEvent
	 */
	default void publishEvent(ApplicationEvent event) {
		publishEvent((Object) event);
	}

	/**
	 * Notify all <strong>matching</strong> listeners registered with this
	 * application of an event.
	 *
	 *
	 *
	 * <p>If the specified {@code event} is not an {@link ApplicationEvent},
	 * it is wrapped in a {@link PayloadApplicationEvent}.
	 *
	 * 如果该事件不是ApplicationEvent，它将会被PayloadApplicationEvent来包装。
	 *
	 * <p>Such an event publication step is effectively a hand-off to the
	 * multicaster and does not imply synchronous/asynchronous execution
	 * or even immediate execution at all. Event listeners are encouraged
	 * to be as efficient as possible, individually using asynchronous
	 * execution for longer-running and potentially blocking operations.
	 *
	 * 这样的事件发布步骤实际上是切换到广播器，并且根本不意味着同步/异步执行，甚至立即执行。鼓励listener尽可能地高效，可以单独使用异步执行长时流程和一些阻塞操作。
	 *
	 * @param event the event to publish
	 * @since 4.2
	 * @see #publishEvent(ApplicationEvent)
	 * @see PayloadApplicationEvent
	 */
	void publishEvent(Object event);

}
