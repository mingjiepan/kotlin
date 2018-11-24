package com.mjie.expression

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame

fun main(args: Array<String>) {

    val jFrame = JFrame("my JFrame")
    val jButton = JButton("my JButton")

    jFrame.addWindowListener(object: WindowListener {
        override fun windowDeiconified(e: WindowEvent?) {
        }

        override fun windowClosing(e: WindowEvent?) {
        }

        override fun windowClosed(e: WindowEvent?) {
            println("windowClosed")
        }

        override fun windowActivated(e: WindowEvent?) {
            println("windowActivated")
        }

        override fun windowDeactivated(e: WindowEvent?) {
        }

        override fun windowOpened(e: WindowEvent?) {
            println("windowOpened")
        }

        override fun windowIconified(e: WindowEvent?) {
        }
    })

    /*jButton.addActionListener(object: ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            println("actionPerformed")
        }
    })*/
    /*
    如果对象是Java函数式接口的一个实例（即只拥有一个抽象方法的接口）
    那么可以通过lambda表达式来调用，其中lambda表达式前面加上接口的类型
     */
    jButton.addActionListener { println("actionPerformed") }

    jButton.addActionListener (ActionListener { println("actionPerformed") })

    val actionListener = ActionListener {
        println("button actionListener")
    }
    println(actionListener.javaClass)

    jFrame.add(jButton)
    jFrame.isVisible = true
    jFrame.pack()
    jFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
}