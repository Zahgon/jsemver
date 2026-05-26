/*
 * The MIT License
 *
 * Copyright 2012-2024 Zafar Khaja <zafarkhaja@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.zafarkhaja.semver.expr;

import com.github.zafarkhaja.semver.ParseException;
import com.github.zafarkhaja.semver.UnexpectedCharacterException;
import com.github.zafarkhaja.semver.Version;

/**
 * This class implements internal DSL for the
 * SemVer Expressions using fluent interface.
 *
 * @author Zafar Khaja {@literal <zafarkhaja@gmail.com>}
 * @since 0.9.0
 */
public class CompositeExpression implements Expression {

    /**
     * A class with static helper methods.
     */
    public static class Helper {

        /**
         * Creates a {@code CompositeExpression} with
         * an underlying {@code Not} expression.
         *
         * @param expr an {@code Expression} to negate
         * @return a newly created {@code CompositeExpression}
         */
        public static CompositeExpression not(Expression expr) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with
         * an underlying {@code Equal} expression.
         *
         * @param version a {@code Version} to check for equality
         * @return a newly created {@code CompositeExpression}
         */
        public static CompositeExpression eq(Version version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with
         * an underlying {@code Equal} expression.
         *
         * @param version a {@code Version} string to check for equality
         * @return a newly created {@code CompositeExpression}
         * @throws IllegalArgumentException if the input string is {@code NULL} or empty
         * @throws ParseException when invalid version string is provided
         * @throws UnexpectedCharacterException is a special case of {@code ParseException}
         */
        public static CompositeExpression eq(String version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with
         * an underlying {@code NotEqual} expression.
         *
         * @param version a {@code Version} to check for non-equality
         * @return a newly created {@code CompositeExpression}
         */
        public static CompositeExpression neq(Version version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with
         * an underlying {@code NotEqual} expression.
         *
         * @param version a {@code Version} string to check for non-equality
         * @return a newly created {@code CompositeExpression}
         * @throws IllegalArgumentException if the input string is {@code NULL} or empty
         * @throws ParseException when invalid version string is provided
         * @throws UnexpectedCharacterException is a special case of {@code ParseException}
         */
        public static CompositeExpression neq(String version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with
         * an underlying {@code Greater} expression.
         *
         * @param version a {@code Version} to compare with
         * @return a newly created {@code CompositeExpression}
         */
        public static CompositeExpression gt(Version version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with
         * an underlying {@code Greater} expression.
         *
         * @param version a {@code Version} string to compare with
         * @return a newly created {@code CompositeExpression}
         * @throws IllegalArgumentException if the input string is {@code NULL} or empty
         * @throws ParseException when invalid version string is provided
         * @throws UnexpectedCharacterException is a special case of {@code ParseException}
         */
        public static CompositeExpression gt(String version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with an
         * underlying {@code GreaterOrEqual} expression.
         *
         * @param version a {@code Version} to compare with
         * @return a newly created {@code CompositeExpression}
         */
        public static CompositeExpression gte(Version version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with an
         * underlying {@code GreaterOrEqual} expression.
         *
         * @param version a {@code Version} string to compare with
         * @return a newly created {@code CompositeExpression}
         * @throws IllegalArgumentException if the input string is {@code NULL} or empty
         * @throws ParseException when invalid version string is provided
         * @throws UnexpectedCharacterException is a special case of {@code ParseException}
         */
        public static CompositeExpression gte(String version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with
         * an underlying {@code Less} expression.
         *
         * @param version a {@code Version} to compare with
         * @return a newly created {@code CompositeExpression}
         */
        public static CompositeExpression lt(Version version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with
         * an underlying {@code Less} expression.
         *
         * @param version a {@code Version} string to compare with
         * @return a newly created {@code CompositeExpression}
         * @throws IllegalArgumentException if the input string is {@code NULL} or empty
         * @throws ParseException when invalid version string is provided
         * @throws UnexpectedCharacterException is a special case of {@code ParseException}
         */
        public static CompositeExpression lt(String version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with an
         * underlying {@code LessOrEqual} expression.
         *
         * @param version a {@code Version} to compare with
         * @return a newly created {@code CompositeExpression}
         */
        public static CompositeExpression lte(Version version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a {@code CompositeExpression} with an
         * underlying {@code LessOrEqual} expression.
         *
         * @param version a {@code Version} string to compare with
         * @return a newly created {@code CompositeExpression}
         * @throws IllegalArgumentException if the input string is {@code NULL} or empty
         * @throws ParseException when invalid version string is provided
         * @throws UnexpectedCharacterException is a special case of {@code ParseException}
         */
        public static CompositeExpression lte(String version) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * The underlying expression tree.
     */
    private Expression exprTree;

    /**
     * Constructs a {@code CompositeExpression}
     * with an underlying {@code Expression}.
     *
     * @param expr the underlying expression
     */
    public CompositeExpression(Expression expr) {
        exprTree = expr;
    }

    /**
     * Adds another {@code Expression} to {@code CompositeExpression}
     * using {@code And} logical expression.
     *
     * @param expr an expression to add
     * @return this {@code CompositeExpression}
     */
    public CompositeExpression and(Expression expr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds another {@code Expression} to {@code CompositeExpression}
     * using {@code Or} logical expression.
     *
     * @param expr an expression to add
     * @return this {@code CompositeExpression}
     */
    public CompositeExpression or(Expression expr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Interprets the expression.
     *
     * @param version a {@code Version} string to interpret against
     * @return the result of the expression interpretation
     * @throws IllegalArgumentException if the input string is {@code NULL} or empty
     * @throws ParseException when invalid version string is provided
     * @throws UnexpectedCharacterException is a special case of {@code ParseException}
     */
    public boolean interpret(String version) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean interpret(Version version) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
