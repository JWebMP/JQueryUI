package com.jwebmp.plugins.jqueryui.draggable.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

public class CursorAt
		extends JavaScriptPart<CursorAt>
{
	/**
	 * Position top
	 */
	private Integer top;
	/**
	 * Position left
	 */
	private Integer left;
	/**
	 * Position right
	 */
	private Integer right;
	/**
	 * Position bottom
	 */
	private Integer bottom;

	public CursorAt()
	{
	}

	public CursorAt(Integer top, Integer left)
	{
		this.top = top;
		this.left = left;
	}

	public CursorAt(Integer top)
	{
		this.top = top;
	}

	public CursorAt(Integer top, Integer left, Integer right, Integer bottom)
	{
		this.top = top;
		this.left = left;
		this.right = right;
		this.bottom = bottom;
	}

	/**
	 * Construcs a new cursor at with the given params
	 *
	 * @param left
	 * 		A new left, Nullable
	 * @param top
	 * 		Top, Nullable
	 * @param right
	 * 		Right, Nullable
	 * @param bottom
	 * 		Bottom, Nullable
	 *
	 * @return A new instance of CursorAt
	 */
	public static CursorAt of(Integer left, Integer top, Integer right, Integer bottom)
	{
		CursorAt newCursorAt = new CursorAt();
		newCursorAt.setLeft(left);
		newCursorAt.setTop(top);
		newCursorAt.setRight(right);
		newCursorAt.setBottom(bottom);
		return newCursorAt;
	}

	public Integer getTop()
	{
		return top;
	}

	public CursorAt setTop(Integer top)
	{
		this.top = top;
		return this;
	}

	public Integer getLeft()
	{
		return left;
	}

	public CursorAt setLeft(Integer left)
	{
		this.left = left;
		return this;
	}

	public Integer getRight()
	{
		return right;
	}

	public CursorAt setRight(Integer right)
	{
		this.right = right;
		return this;
	}

	public Integer getBottom()
	{
		return bottom;
	}

	public CursorAt setBottom(Integer bottom)
	{
		this.bottom = bottom;
		return this;
	}
}
