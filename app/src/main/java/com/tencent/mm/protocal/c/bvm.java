package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bvm
  extends bhd
{
  public String hbL;
  public int hcE;
  public String jQb;
  public int rdV;
  public int rdW;
  public int rdX;
  public int rdn;
  public bhy rtW;
  public String rwt;
  public String ssa;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      paramVarArgs.fT(3, this.rdn);
      if (this.ssa != null) {
        paramVarArgs.g(4, this.ssa);
      }
      if (this.hbL != null) {
        paramVarArgs.g(5, this.hbL);
      }
      paramVarArgs.fT(6, this.rdV);
      paramVarArgs.fT(7, this.rdW);
      paramVarArgs.fT(8, this.rdX);
      if (this.rtW != null)
      {
        paramVarArgs.fV(9, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.fT(10, this.hcE);
      if (this.rwt != null) {
        paramVarArgs.g(11, this.rwt);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label877;
      }
    }
    label877:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jQb != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jQb);
      }
      i += f.a.a.a.fQ(3, this.rdn);
      paramInt = i;
      if (this.ssa != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.ssa);
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hbL);
      }
      i = i + f.a.a.a.fQ(6, this.rdV) + f.a.a.a.fQ(7, this.rdW) + f.a.a.a.fQ(8, this.rdX);
      paramInt = i;
      if (this.rtW != null) {
        paramInt = i + f.a.a.a.fS(9, this.rtW.boi());
      }
      i = paramInt + f.a.a.a.fQ(10, this.hcE);
      paramInt = i;
      if (this.rwt != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rwt);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bvm localbvm = (bvm)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbvm.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbvm.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbvm.rdn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbvm.ssa = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbvm.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbvm.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbvm.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbvm.rdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbvm.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 10: 
          localbvm.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbvm.rwt = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bvm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */