package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bqb
  extends bhd
{
  public int hcE;
  public String jQb;
  public int rWa;
  public int rWb;
  public int rXx;
  public String rcc;
  public int rdV;
  public int rdW;
  public String rej;
  public bhy rfy;
  public int rth;
  public String rwt;
  public bue sdt;
  public int soa;
  public int sob;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rfy == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.hcE);
      paramVarArgs.fT(3, this.rdW);
      paramVarArgs.fT(4, this.rdV);
      if (this.rfy != null)
      {
        paramVarArgs.fV(5, this.rfy.boi());
        this.rfy.a(paramVarArgs);
      }
      if (this.rcc != null) {
        paramVarArgs.g(6, this.rcc);
      }
      paramVarArgs.fT(7, this.rWa);
      paramVarArgs.fT(8, this.rWb);
      if (this.rej != null) {
        paramVarArgs.g(9, this.rej);
      }
      paramVarArgs.fT(10, this.soa);
      paramVarArgs.fT(11, this.rth);
      if (this.sdt != null)
      {
        paramVarArgs.fV(12, this.sdt.boi());
        this.sdt.a(paramVarArgs);
      }
      if (this.jQb != null) {
        paramVarArgs.g(13, this.jQb);
      }
      paramVarArgs.fT(14, this.rXx);
      if (this.rwt != null) {
        paramVarArgs.g(15, this.rwt);
      }
      paramVarArgs.fT(16, this.sob);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1182;
      }
    }
    label1182:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hcE) + f.a.a.a.fQ(3, this.rdW) + f.a.a.a.fQ(4, this.rdV);
      paramInt = i;
      if (this.rfy != null) {
        paramInt = i + f.a.a.a.fS(5, this.rfy.boi());
      }
      i = paramInt;
      if (this.rcc != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rcc);
      }
      i = i + f.a.a.a.fQ(7, this.rWa) + f.a.a.a.fQ(8, this.rWb);
      paramInt = i;
      if (this.rej != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rej);
      }
      i = paramInt + f.a.a.a.fQ(10, this.soa) + f.a.a.a.fQ(11, this.rth);
      paramInt = i;
      if (this.sdt != null) {
        paramInt = i + f.a.a.a.fS(12, this.sdt.boi());
      }
      i = paramInt;
      if (this.jQb != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.jQb);
      }
      i += f.a.a.a.fQ(14, this.rXx);
      paramInt = i;
      if (this.rwt != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.rwt);
      }
      return paramInt + f.a.a.a.fQ(16, this.sob);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rfy != null) {
          break;
        }
        throw new b("Not all required fields were included: Buffer");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bqb localbqb = (bqb)paramVarArgs[1];
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
            localbqb.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbqb.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbqb.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbqb.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbqb.rfy = ((bhy)localObject1);
            paramInt += 1;
          }
        case 6: 
          localbqb.rcc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbqb.rWa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbqb.rWb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbqb.rej = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbqb.soa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbqb.rth = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bue();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bue)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbqb.sdt = ((bue)localObject1);
            paramInt += 1;
          }
        case 13: 
          localbqb.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localbqb.rXx = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localbqb.rwt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbqb.sob = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */