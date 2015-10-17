package com.mauriciotogneri.designpatterns.structural.bridge;

public interface DrawingApi
{
    void drawCircle(float x, float y, float radius);

    void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3);

    void drawRectangle(float x, float y, float width, float height);
}