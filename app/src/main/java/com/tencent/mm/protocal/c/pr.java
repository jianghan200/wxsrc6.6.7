package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class pr
  extends com.tencent.mm.bk.a
{
  public String huX;
  public String huY;
  public String lMY;
  public String rnv;
  public String rnw;
  public long roL;
  public String roM;
  public String roN;
  public akz rtT;
  public String title;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      if (this.huX != null) {
        paramVarArgs.g(2, this.huX);
      }
      if (this.huY != null) {
        paramVarArgs.g(3, this.huY);
      }
      if (this.url != null) {
        paramVarArgs.g(4, this.url);
      }
      paramVarArgs.T(5, this.roL);
      if (this.roM != null) {
        paramVarArgs.g(6, this.roM);
      }
      if (this.roN != null) {
        paramVarArgs.g(7, this.roN);
      }
      if (this.lMY != null) {
        paramVarArgs.g(8, this.lMY);
      }
      if (this.rtT != null)
      {
        paramVarArgs.fV(9, this.rtT.boi());
        this.rtT.a(paramVarArgs);
      }
      if (this.rnv != null) {
        paramVarArgs.g(10, this.rnv);
      }
      if (this.rnw != null) {
        paramVarArgs.g(11, this.rnw);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label819;
      }
    }
    label819:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.huX != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.huX);
      }
      i = paramInt;
      if (this.huY != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.huY);
      }
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.url);
      }
      i = paramInt + f.a.a.a.S(5, this.roL);
      paramInt = i;
      if (this.roM != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.roM);
      }
      i = paramInt;
      if (this.roN != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.roN);
      }
      paramInt = i;
      if (this.lMY != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.lMY);
      }
      i = paramInt;
      if (this.rtT != null) {
        i = paramInt + f.a.a.a.fS(9, this.rtT.boi());
      }
      paramInt = i;
      if (this.rnv != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rnv);
      }
      i = paramInt;
      if (this.rnw != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.rnw);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        pr localpr = (pr)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localpr.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localpr.huX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localpr.huY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localpr.url = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localpr.roL = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localpr.roM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localpr.roN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localpr.lMY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new akz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((akz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localpr.rtT = ((akz)localObject1);
            paramInt += 1;
          }
        case 10: 
          localpr.rnv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localpr.rnw = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/pr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */