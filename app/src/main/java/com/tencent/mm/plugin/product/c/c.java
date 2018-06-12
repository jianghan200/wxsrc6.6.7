package com.tencent.mm.plugin.product.c;

import java.util.LinkedList;

public final class c
  extends com.tencent.mm.bk.a
{
  public String detail;
  public String dzA;
  public String lNV;
  public int lRA;
  public int lRB;
  public int lRC;
  public LinkedList<String> lRD = new LinkedList();
  public LinkedList<String> lRE = new LinkedList();
  public LinkedList<b> lRF = new LinkedList();
  public LinkedList<String> lRG = new LinkedList();
  public int lRH;
  public int lRI;
  public LinkedList<m> lRJ = new LinkedList();
  public LinkedList<a> lRK = new LinkedList();
  public k lRL;
  public LinkedList<d> lRz = new LinkedList();
  public String name;
  public int version;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.name != null) {
        paramVarArgs.g(1, this.name);
      }
      paramVarArgs.d(2, 8, this.lRz);
      paramVarArgs.fT(3, this.lRA);
      paramVarArgs.fT(4, this.lRB);
      paramVarArgs.fT(5, this.lRC);
      paramVarArgs.d(6, 1, this.lRD);
      if (this.dzA != null) {
        paramVarArgs.g(7, this.dzA);
      }
      if (this.detail != null) {
        paramVarArgs.g(8, this.detail);
      }
      paramVarArgs.d(9, 1, this.lRE);
      paramVarArgs.d(10, 8, this.lRF);
      paramVarArgs.d(11, 1, this.lRG);
      paramVarArgs.fT(12, this.lRH);
      paramVarArgs.fT(13, this.lRI);
      paramVarArgs.d(14, 8, this.lRJ);
      paramVarArgs.fT(15, this.version);
      paramVarArgs.d(16, 8, this.lRK);
      if (this.lNV != null) {
        paramVarArgs.g(17, this.lNV);
      }
      if (this.lRL != null)
      {
        paramVarArgs.fV(18, this.lRL.boi());
        this.lRL.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.name == null) {
        break label1416;
      }
    }
    label1416:
    for (paramInt = f.a.a.b.b.a.h(1, this.name) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.lRz) + f.a.a.a.fQ(3, this.lRA) + f.a.a.a.fQ(4, this.lRB) + f.a.a.a.fQ(5, this.lRC) + f.a.a.a.c(6, 1, this.lRD);
      paramInt = i;
      if (this.dzA != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.dzA);
      }
      i = paramInt;
      if (this.detail != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.detail);
      }
      i = i + f.a.a.a.c(9, 1, this.lRE) + f.a.a.a.c(10, 8, this.lRF) + f.a.a.a.c(11, 1, this.lRG) + f.a.a.a.fQ(12, this.lRH) + f.a.a.a.fQ(13, this.lRI) + f.a.a.a.c(14, 8, this.lRJ) + f.a.a.a.fQ(15, this.version) + f.a.a.a.c(16, 8, this.lRK);
      paramInt = i;
      if (this.lNV != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.lNV);
      }
      i = paramInt;
      if (this.lRL != null) {
        i = paramInt + f.a.a.a.fS(18, this.lRL.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.lRz.clear();
        this.lRD.clear();
        this.lRE.clear();
        this.lRF.clear();
        this.lRG.clear();
        this.lRJ.clear();
        this.lRK.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        c localc = (c)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localc.name = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new d();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((d)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localc.lRz.add(localObject1);
            paramInt += 1;
          }
        case 3: 
          localc.lRA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localc.lRB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localc.lRC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localc.lRD.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 7: 
          localc.dzA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localc.detail = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localc.lRE.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new b();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((b)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localc.lRF.add(localObject1);
            paramInt += 1;
          }
        case 11: 
          localc.lRG.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 12: 
          localc.lRH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localc.lRI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new m();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((m)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localc.lRJ.add(localObject1);
            paramInt += 1;
          }
        case 15: 
          localc.version = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new a();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((a)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localc.lRK.add(localObject1);
            paramInt += 1;
          }
        case 17: 
          localc.lNV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new k();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((k)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localc.lRL = ((k)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/product/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */