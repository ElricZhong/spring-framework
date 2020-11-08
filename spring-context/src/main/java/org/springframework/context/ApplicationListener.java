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

import java.util.EventListener;

/**
 * Interface to be implemented by application event listeners.
 *
 * 应用事件监听器要实现的接口
 *
 * <p>Based on the standard {@code java.util.EventListener} interface
 * for the Observer design pattern.
 *
 * 基于观察者模式的标准java.util.EventListener接口
 *
 * <p>As of Spring 3.0, an {@code ApplicationListener} can generically declare
 * the event type that it is interested in. When registered with a Spring
 * {@code ApplicationContext}, events will be filtered accordingly, with the
 * listener getting invoked for matching event objects only.
 *
 * 从Spring 3.0开始，一个ApplicationListener一般可以声明它感兴趣的事件类型。当向一个Spring ApplicationContext注册它时，将过滤相应的时间，并且只针对匹配的事件对象调用监听器。
 *
 * @author Rod Johnson
 * @author Juergen Hoeller
 * @param <E> the specific {@code ApplicationEvent} subclass to listen to
 * @see org.springframework.context.ApplicationEvent
 * @see org.springframework.context.event.ApplicationEventMulticaster
 * @see org.springframework.context.event.EventListener
 */
@FunctionalInterface
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

	/**
	 * Handle an application event.
	 *
	 * 处理一个应用事件。
	 *
	 * @param event the event to respond to
	 */
	void onApplicationEvent(E event);

}
