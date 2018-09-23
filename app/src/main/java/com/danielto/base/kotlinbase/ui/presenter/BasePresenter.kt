/*
 * © 2018 Match Group, LLC.
 */

package com.danielto.base.kotlinbase.ui.presenter

abstract class BasePresenter<T> {

    private var target: T? = null

    fun takeTarget(target: T) {
        this.target = target
    }

    fun dropTarget() {
        target = null
    }

    fun target(): T? {
        return target
    }
}
