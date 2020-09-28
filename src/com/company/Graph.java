package com.company;

import java.util.*;

public class Graph {

    private static Node a1 = new Node(null, Graph.a2, null, Graph.b1, null, null, Graph.b2, null);
    private static Node b1 = new Node(null, Graph.b2, a1, Graph.c1, null, null, Graph.c2, Graph.a2);
    private static Node c1 = new Node(null, Graph.c2, b1, Graph.d1, null, null, Graph.d2, Graph.b2);
    private static Node d1 = new Node(null, Graph.d2, c1, Graph.e1, null, null, Graph.e2, Graph.c2);
    private static Node e1 = new Node(null, Graph.e2, d1, Graph.f1, null, null, Graph.f2, Graph.d2);
    private static Node f1 = new Node(null, Graph.f2, e1, Graph.g1, null, null, Graph.g2, Graph.e2);
    private static Node g1 = new Node(null, Graph.g2, f1, Graph.h1, null, null, Graph.h2, Graph.f2);
    private static Node h1 = new Node(null, Graph.h2, g1, Graph.i1, null, null, Graph.i2, Graph.g2);
    private static Node i1 = new Node(null, Graph.i2, h1, Graph.j1, null, null, Graph.j2, Graph.h2);
    private static Node j1 = new Node(null, Graph.j2, i1, Graph.k1, null, null, Graph.k2, Graph.i2);
    private static Node k1 = new Node(null, Graph.k2, j1, null, null, null, null, Graph.j2);

    private static Node a2 = new Node(a1, Graph.a3, null, Graph.b2, b1, null, Graph.b3, null);
    private static Node b2 = new Node(b1, Graph.b3, a2, Graph.c2, c1, a1, Graph.c3, Graph.a3);
    private static Node c2 = new Node(c1, Graph.c3, b2, Graph.d2, d1, b1, Graph.d3, Graph.b3);
    private static Node d2 = new Node(d1, Graph.d3, c2, Graph.e2, e1, c1, Graph.e3, Graph.c3);
    private static Node e2 = new Node(e1, Graph.e3, d2, Graph.f2, f1, d1, Graph.f3, Graph.d3);
    private static Node f2 = new Node(f1, Graph.f3, e2, Graph.g2, g1, e1, Graph.g3, Graph.e3);
    private static Node g2 = new Node(g1, Graph.g3, f2, Graph.h2, h1, f1, Graph.h3, Graph.f3);
    private static Node h2 = new Node(h1, Graph.h3, g2, Graph.i2, i1, g1, Graph.i3, Graph.g3);
    private static Node i2 = new Node(i1, Graph.i3, h2, Graph.j2, j1, h1, Graph.j3, Graph.h3);
    private static Node j2 = new Node(j1, Graph.j3, i2, Graph.k2, k1, i1, Graph.k3, Graph.i3);
    private static Node k2 = new Node(k1, Graph.k3, j2, null, null, j1, null, Graph.j3);

    private static Node a3 = new Node(a2, Graph.a4, null, Graph.b3, b2, null, Graph.b4, null);
    private static Node b3 = new Node(b2, Graph.b4, a3, Graph.c3, c2, a2, Graph.c4, Graph.a4);
    private static Node c3 = new Node(c2, Graph.c4, b3, Graph.d3, d2, b2, Graph.d4, Graph.b4);
    private static Node d3 = new Node(d2, Graph.d4, c3, Graph.e3, e2, c2, Graph.e4, Graph.c4);
    private static Node e3 = new Node(e2, Graph.e4, d3, Graph.f3, f2, d2, Graph.f4, Graph.d4);
    private static Node f3 = new Node(f2, Graph.f4, e3, Graph.g3, g2, e2, Graph.g4, Graph.e4);
    private static Node g3 = new Node(g2, Graph.g4, f3, Graph.h3, h2, f2, Graph.h4, Graph.f4);
    private static Node h3 = new Node(h2, Graph.h4, g3, Graph.i3, i2, g2, Graph.i4, Graph.g4);
    private static Node i3 = new Node(i2, Graph.i4, h3, Graph.j3, j2, h2, Graph.j4, Graph.h4);
    private static Node j3 = new Node(j2, Graph.j4, i3, Graph.k3, k2, i2, Graph.k4, Graph.i4);
    private static Node k3 = new Node(k2, Graph.k4, j3, null, null, j2, null, Graph.j4);

    private static Node a4 = new Node(a3, Graph.a5, null, Graph.b4, b3, null, Graph.b3, null);
    private static Node b4 = new Node(b3, Graph.b5, a4, Graph.c4, c3, a3, Graph.c5, Graph.a5);
    private static Node c4 = new Node(c3, Graph.c5, b4, Graph.d4, d3, b3, Graph.d5, Graph.b5);
    private static Node d4 = new Node(d3, Graph.d5, c4, Graph.e4, e3, c3, Graph.e5, Graph.c5);
    private static Node e4 = new Node(e3, Graph.e5, d4, Graph.f4, f3, d3, Graph.f5, Graph.d5);
    private static Node f4 = new Node(f3, Graph.f5, e4, Graph.g4, g3, e3, Graph.g5, Graph.e5);
    private static Node g4 = new Node(g3, Graph.g5, f4, Graph.h4, h3, f3, Graph.h5, Graph.f5);
    private static Node h4 = new Node(h3, Graph.h5, g4, Graph.i4, i3, g3, Graph.i5, Graph.g5);
    private static Node i4 = new Node(i3, Graph.i5, h4, Graph.j4, j3, h3, Graph.j5, Graph.h5);
    private static Node j4 = new Node(j3, Graph.j5, i4, Graph.k4, k3, i3, Graph.k5, Graph.i5);
    private static Node k4 = new Node(k3, Graph.k5, j4, null, null, j3, null, Graph.j5);

    private static Node a5 = new Node(a4, Graph.a6, null, Graph.b5, b4, null, Graph.b4, null);
    private static Node b5 = new Node(b4, Graph.b6, a5, Graph.c5, c4, a4, Graph.c6, Graph.a6);
    private static Node c5 = new Node(c4, Graph.c6, b5, Graph.d5, d4, b4, Graph.d6, Graph.b6);
    private static Node d5 = new Node(d4, Graph.d6, c5, Graph.e5, e4, c4, Graph.e6, Graph.c6);
    private static Node e5 = new Node(e4, Graph.e6, d5, Graph.f5, f4, d4, Graph.f6, Graph.d6);
    private static Node f5 = new Node(f4, Graph.f6, e5, Graph.g5, g4, e4, Graph.g6, Graph.e6);
    private static Node g5 = new Node(g4, Graph.g6, f5, Graph.h5, h4, f4, Graph.h6, Graph.f6);
    private static Node h5 = new Node(h4, Graph.h6, g5, Graph.i5, i4, g4, Graph.i6, Graph.g6);
    private static Node i5 = new Node(i4, Graph.i6, h5, Graph.j5, j4, h4, Graph.j6, Graph.h6);
    private static Node j5 = new Node(j4, Graph.j6, i5, Graph.k5, k4, i4, Graph.k6, Graph.i6);
    private static Node k5 = new Node(k4, Graph.k6, j5, null, null, j4, null, Graph.j6);

    private static Node a6 = new Node(a5, Graph.a7, null, Graph.b6, b5, null, Graph.b5, null);
    private static Node b6 = new Node(b5, Graph.b7, a6, Graph.c6, c5, a5, Graph.c7, Graph.a7);
    private static Node c6 = new Node(c5, Graph.c7, b6, Graph.d6, d5, b5, Graph.d7, Graph.b7);
    private static Node d6 = new Node(d5, Graph.d7, c6, Graph.e6, e5, c5, Graph.e7, Graph.c7);
    private static Node e6 = new Node(e5, Graph.e7, d6, Graph.f6, f5, d5, Graph.f7, Graph.d7);
    private static Node f6 = new Node(f5, Graph.f7, e6, Graph.g6, g5, e5, Graph.g7, Graph.e7);
    private static Node g6 = new Node(g5, Graph.g7, f6, Graph.h6, h5, f5, Graph.h7, Graph.f7);
    private static Node h6 = new Node(h5, Graph.h7, g6, Graph.i6, i5, g5, Graph.i7, Graph.g7);
    private static Node i6 = new Node(i5, Graph.i7, h6, Graph.j6, j5, h5, Graph.j7, Graph.h7);
    private static Node j6 = new Node(j5, Graph.j7, i6, Graph.k6, k5, i5, Graph.k7, Graph.i7);
    private static Node k6 = new Node(k5, Graph.k7, j6, null, null, j5, null, Graph.j7);

    private static Node a7 = new Node(a6, Graph.a8, null, Graph.b7, b6, null, Graph.b6, null);
    private static Node b7 = new Node(b6, Graph.b8, a7, Graph.c7, c6, a6, Graph.c8, Graph.a8);
    private static Node c7 = new Node(c6, Graph.c8, b7, Graph.d7, d6, b6, Graph.d8, Graph.b8);
    private static Node d7 = new Node(d6, Graph.d8, c7, Graph.e7, e6, c6, Graph.e8, Graph.c8);
    private static Node e7 = new Node(e6, Graph.e8, d7, Graph.f7, f6, d6, Graph.f8, Graph.d8);
    private static Node f7 = new Node(f6, Graph.f8, e7, Graph.g7, g6, e6, Graph.g8, Graph.e8);
    private static Node g7 = new Node(g6, Graph.g8, f7, Graph.h7, h6, f6, Graph.h8, Graph.f8);
    private static Node h7 = new Node(h6, Graph.h8, g7, Graph.i7, i6, g6, Graph.i8, Graph.g8);
    private static Node i7 = new Node(i6, Graph.i8, h7, Graph.j7, j6, h6, Graph.j8, Graph.h8);
    private static Node j7 = new Node(j6, Graph.j8, i7, Graph.k7, k6, i6, Graph.k8, Graph.i8);
    private static Node k7 = new Node(k6, Graph.k8, j7, null, null, j6, null, Graph.j8);

    private static Node a8 = new Node(a7, Graph.a9, null, Graph.b8, b7, null, Graph.b7, null);
    private static Node b8 = new Node(b7, Graph.b9, a8, Graph.c8, c7, a7, Graph.c9, Graph.a9);
    private static Node c8 = new Node(c7, Graph.c9, b8, Graph.d8, d7, b7, Graph.d9, Graph.b9);
    private static Node d8 = new Node(d7, Graph.d9, c8, Graph.e8, e7, c7, Graph.e9, Graph.c9);
    private static Node e8 = new Node(e7, Graph.e9, d8, Graph.f8, f7, d7, Graph.f9, Graph.d9);
    private static Node f8 = new Node(f7, Graph.f9, e8, Graph.g8, g7, e7, Graph.g9, Graph.e9);
    private static Node g8 = new Node(g7, Graph.g9, f8, Graph.h8, h7, f7, Graph.h9, Graph.f9);
    private static Node h8 = new Node(h7, Graph.h9, g8, Graph.i8, i7, g7, Graph.i9, Graph.g9);
    private static Node i8 = new Node(i7, Graph.i9, h8, Graph.j8, j7, h7, Graph.j9, Graph.h9);
    private static Node j8 = new Node(j7, Graph.j9, i8, Graph.k8, k7, i7, Graph.k9, Graph.i9);
    private static Node k8 = new Node(k7, Graph.k9, j8, null, null, j7, null, Graph.j9);

    private static Node a9 = new Node(a8, Graph.a10, null, Graph.b9, b8, null, Graph.b8, null);
    private static Node b9 = new Node(b8, Graph.b10, a9, Graph.c9, c8, a8, Graph.c10, Graph.a10);
    private static Node c9 = new Node(c8, Graph.c10, b9, Graph.d9, d8, b8, Graph.d10, Graph.b10);
    private static Node d9 = new Node(d8, Graph.d10, c9, Graph.e9, e8, c8, Graph.e10, Graph.c10);
    private static Node e9 = new Node(e8, Graph.e10, d9, Graph.f9, f8, d8, Graph.f10, Graph.d10);
    private static Node f9 = new Node(f8, Graph.f10, e9, Graph.g9, g8, e8, Graph.g10, Graph.e10);
    private static Node g9 = new Node(g8, Graph.g10, f9, Graph.h9, h8, f8, Graph.h10, Graph.f10);
    private static Node h9 = new Node(h8, Graph.h10, g9, Graph.i9, i8, g8, Graph.i10, Graph.g10);
    private static Node i9 = new Node(i8, Graph.i10, h9, Graph.j9, j8, h8, Graph.j10, Graph.h10);
    private static Node j9 = new Node(j8, Graph.j10, i9, Graph.k9, k8, i8, Graph.k10, Graph.i10);
    private static Node k9 = new Node(k8, Graph.k10, j9, null, null, j8, null, Graph.j10);

    private static Node a10 = new Node(a9, Graph.a11, null, Graph.b10, b9, null, Graph.b9, null);
    private static Node b10 = new Node(b9, Graph.b11, a10, Graph.c10, c9, a9, Graph.c11, Graph.a11);
    private static Node c10 = new Node(c9, Graph.c11, b10, Graph.d10, d9, b9, Graph.d11, Graph.b11);
    private static Node d10 = new Node(d9, Graph.d11, c10, Graph.e10, e9, c9, Graph.e11, Graph.c11);
    private static Node e10 = new Node(e9, Graph.e11, d10, Graph.f10, f9, d9, Graph.f11, Graph.d11);
    private static Node f10 = new Node(f9, Graph.f11, e10, Graph.g10, g9, e9, Graph.g11, Graph.e11);
    private static Node g10 = new Node(g9, Graph.g11, f10, Graph.h10, h9, f9, Graph.h11, Graph.f11);
    private static Node h10 = new Node(h9, Graph.h11, g10, Graph.i10, i9, g9, Graph.i11, Graph.g11);
    private static Node i10 = new Node(i9, Graph.i11, h10, Graph.j10, j9, h9, Graph.j11, Graph.h11);
    private static Node j10 = new Node(j9, Graph.j11, i10, Graph.k10, k9, i9, Graph.k11, Graph.i11);
    private static Node k10 = new Node(k9, Graph.k11, j10, null, null, j9, null, Graph.j11);

    private static Node a11 = new Node(a10, Graph.a12, null, Graph.b11, b10, null, Graph.b10, null);
    private static Node b11 = new Node(b10, Graph.b12, a11, Graph.c11, c10, a10, Graph.c12, Graph.a12);
    private static Node c11 = new Node(c10, Graph.c12, b11, Graph.d11, d10, b10, Graph.d12, Graph.b12);
    private static Node d11 = new Node(d10, Graph.d12, c11, Graph.e11, e10, c10, Graph.e12, Graph.c12);
    private static Node e11 = new Node(e10, Graph.e12, d11, Graph.f11, f10, d10, Graph.f12, Graph.d12);
    private static Node f11 = new Node(f10, Graph.f12, e11, Graph.g11, g10, e10, Graph.g12, Graph.e12);
    private static Node g11 = new Node(g10, Graph.g12, f11, Graph.h11, h10, f10, Graph.h12, Graph.f12);
    private static Node h11 = new Node(h10, Graph.h12, g11, Graph.i11, i10, g10, Graph.i12, Graph.g12);
    private static Node i11 = new Node(i10, Graph.i12, h11, Graph.j11, j10, h10, Graph.j12, Graph.h12);
    private static Node j11 = new Node(j10, Graph.j12, i11, Graph.k11, k10, i10, Graph.k12, Graph.i12);
    private static Node k11 = new Node(k10, Graph.k12, j11, null, null, j10, null, Graph.j12);

    private static Node a12 = new Node(a11, null, null, Graph.b12, b11, null, Graph.b11, null);
    private static Node b12 = new Node(b11, null, a12, Graph.c12, c11, a11, null, null);
    private static Node c12 = new Node(c11, null, b12, Graph.d12, d11, b11, null, null);
    private static Node d12 = new Node(d11, null, c12, Graph.e12, e11, c11, null, null);
    private static Node e12 = new Node(e11, null, d12, Graph.f12, f11, d11, null, null);
    private static Node f12 = new Node(f11, null, e12, Graph.g12, g11, e11, null, null);
    private static Node g12 = new Node(g11, null, f12, Graph.h12, h11, f11, null, null);
    private static Node h12 = new Node(h11, null, g12, Graph.i12, i11, g11, null, null);
    private static Node i12 = new Node(i11, null, h12, Graph.j12, j11, h11, null, null);
    private static Node j12 = new Node(j11, null, i12, Graph.k12, k11, i11, null, null);
    private static Node k12 = new Node(k11, null, j12, null, null, j11, null, null);


    public static Node commanderStartNode() {
        return g12;
    }

    public static Node getA1() {
        return a1;
    }

    public static Node getB1() {
        return b1;
    }

    public static Node getC1() {
        return c1;
    }

    public static Node getD1() {
        return d1;
    }

    public static Node getE1() {
        return e1;
    }

    public static Node getF1() {
        return f1;
    }

    public static Node getG1() {
        return g1;
    }

    public static Node getH1() {
        return h1;
    }

    public static Node getI1() {
        return i1;
    }

    public static Node getJ1() {
        return j1;
    }

    public static Node getK1() {
        return k1;
    }

    public static Node getA2() {
        return a2;
    }

    public static Node getB2() {
        return b2;
    }

    public static Node getC2() {
        return c2;
    }

    public static Node getD2() {
        return d2;
    }

    public static Node getE2() {
        return e2;
    }

    public static Node getF2() {
        return f2;
    }

    public static Node getG2() {
        return g2;
    }

    public static Node getH2() {
        return h2;
    }

    public static Node getI2() {
        return i2;
    }

    public static Node getJ2() {
        return j2;
    }

    public static Node getK2() {
        return k2;
    }

    public static Node getA3() {
        return a3;
    }

    public static Node getB3() {
        return b3;
    }

    public static Node getC3() {
        return c3;
    }

    public static Node getD3() {
        return d3;
    }

    public static Node getE3() {
        return e3;
    }

    public static Node getF3() {
        return f3;
    }

    public static Node getG3() {
        return g3;
    }

    public static Node getH3() {
        return h3;
    }

    public static Node getI3() {
        return i3;
    }

    public static Node getJ3() {
        return j3;
    }

    public static Node getK3() {
        return k3;
    }

    public static Node getA4() {
        return a4;
    }

    public static Node getB4() {
        return b4;
    }

    public static Node getC4() {
        return c4;
    }

    public static Node getD4() {
        return d4;
    }

    public static Node getE4() {
        return e4;
    }

    public static Node getF4() {
        return f4;
    }

    public static Node getG4() {
        return g4;
    }

    public static Node getH4() {
        return h4;
    }

    public static Node getI4() {
        return i4;
    }

    public static Node getJ4() {
        return j4;
    }

    public static Node getK4() {
        return k4;
    }

    public static Node getA5() {
        return a5;
    }

    public static Node getB5() {
        return b5;
    }

    public static Node getC5() {
        return c5;
    }

    public static Node getD5() {
        return d5;
    }

    public static Node getE5() {
        return e5;
    }

    public static Node getF5() {
        return f5;
    }

    public static Node getG5() {
        return g5;
    }

    public static Node getH5() {
        return h5;
    }

    public static Node getI5() {
        return i5;
    }

    public static Node getJ5() {
        return j5;
    }

    public static Node getK5() {
        return k5;
    }

    public static Node getA6() {
        return a6;
    }

    public static Node getB6() {
        return b6;
    }

    public static Node getC6() {
        return c6;
    }

    public static Node getD6() {
        return d6;
    }

    public static Node getE6() {
        return e6;
    }

    public static Node getF6() {
        return f6;
    }

    public static Node getG6() {
        return g6;
    }

    public static Node getH6() {
        return h6;
    }

    public static Node getI6() {
        return i6;
    }

    public static Node getJ6() {
        return j6;
    }

    public static Node getK6() {
        return k6;
    }

    public static Node getA7() {
        return a7;
    }

    public static Node getB7() {
        return b7;
    }

    public static Node getC7() {
        return c7;
    }

    public static Node getD7() {
        return d7;
    }

    public static Node getE7() {
        return e7;
    }

    public static Node getF7() {
        return f7;
    }

    public static Node getG7() {
        return g7;
    }

    public static Node getH7() {
        return h7;
    }

    public static Node getI7() {
        return i7;
    }

    public static Node getJ7() {
        return j7;
    }

    public static Node getK7() {
        return k7;
    }

    public static Node getA8() {
        return a8;
    }

    public static Node getB8() {
        return b8;
    }

    public static Node getC8() {
        return c8;
    }

    public static Node getD8() {
        return d8;
    }

    public static Node getE8() {
        return e8;
    }

    public static Node getF8() {
        return f8;
    }

    public static Node getG8() {
        return g8;
    }

    public static Node getH8() {
        return h8;
    }

    public static Node getI8() {
        return i8;
    }

    public static Node getJ8() {
        return j8;
    }

    public static Node getK8() {
        return k8;
    }

    public static Node getA9() {
        return a9;
    }

    public static Node getB9() {
        return b9;
    }

    public static Node getC9() {
        return c9;
    }

    public static Node getD9() {
        return d9;
    }

    public static Node getE9() {
        return e9;
    }

    public static Node getF9() {
        return f9;
    }

    public static Node getG9() {
        return g9;
    }

    public static Node getH9() {
        return h9;
    }

    public static Node getI9() {
        return i9;
    }

    public static Node getJ9() {
        return j9;
    }

    public static Node getK9() {
        return k9;
    }

    public static Node getA10() {
        return a10;
    }

    public static Node getB10() {
        return b10;
    }

    public static Node getC10() {
        return c10;
    }

    public static Node getD10() {
        return d10;
    }

    public static Node getE10() {
        return e10;
    }

    public static Node getF10() {
        return f10;
    }

    public static Node getG10() {
        return g10;
    }

    public static Node getH10() {
        return h10;
    }

    public static Node getI10() {
        return i10;
    }

    public static Node getJ10() {
        return j10;
    }

    public static Node getK10() {
        return k10;
    }

    public static Node getA11() {
        return a11;
    }

    public static Node getB11() {
        return b11;
    }

    public static Node getC11() {
        return c11;
    }

    public static Node getD11() {
        return d11;
    }

    public static Node getE11() {
        return e11;
    }

    public static Node getF11() {
        return f11;
    }

    public static Node getG11() {
        return g11;
    }

    public static Node getH11() {
        return h11;
    }

    public static Node getI11() {
        return i11;
    }

    public static Node getJ11() {
        return j11;
    }

    public static Node getK11() {
        return k11;
    }

    public static Node getA12() {
        return a12;
    }

    public static Node getB12() {
        return b12;
    }

    public static Node getC12() {
        return c12;
    }

    public static Node getD12() {
        return d12;
    }

    public static Node getE12() {
        return e12;
    }

    public static Node getF12() {
        return f12;
    }

    public static Node getG12() {
        return g12;
    }

    public static Node getH12() {
        return h12;
    }

    public static Node getI12() {
        return i12;
    }

    public static Node getJ12() {
        return j12;
    }

    public static Node getK12() {
        return k12;
    }

//    public String getNodeName() {
//        Map<Node, String> nodeToString = new HashMap<>();
//        nodeToString.put(a1,"a1");
//        nodeToString.put(b1, "b1");
//        nodeToString.put(c1,"a1");
//        nodeToString.put(d1, "b1");
//        nodeToString.put(e1,"a1");
//        nodeToString.put(f1, "b1");
//
//    }

    public static void graphPassage() {
        Node startNode = a1;
        Node currentNode = startNode;
        int k = 0;
        while (currentNode != null) {
            k++;
            System.out.print(currentNode);
            currentNode = currentNode.getRightConnection();
        }
        System.err.print(k);
    }

}
