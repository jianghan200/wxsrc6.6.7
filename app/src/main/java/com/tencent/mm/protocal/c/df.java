package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class df
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public String jQb;
  public String jSA;
  public String jTu;
  public String jTv;
  public int lOH;
  public String rco;
  public int rdn;
  public String rdo;
  public bhy rdp;
  public int rdq;
  public int rdr;
  public String rds;
  public String rdt;
  public String rdu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jTv != null) {
        paramVarArgs.g(1, this.jTv);
      }
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      paramVarArgs.fT(3, this.rdn);
      if (this.jTu != null) {
        paramVarArgs.g(4, this.jTu);
      }
      paramVarArgs.fT(5, this.hcE);
      if (this.jSA != null) {
        paramVarArgs.g(6, this.jSA);
      }
      paramVarArgs.fT(7, this.lOH);
      if (this.rdo != null) {
        paramVarArgs.g(8, this.rdo);
      }
      if (this.rdp != null)
      {
        paramVarArgs.fV(9, this.rdp.boi());
        this.rdp.a(paramVarArgs);
      }
      paramVarArgs.fT(10, this.rdq);
      paramVarArgs.fT(11, this.rdr);
      if (this.rco != null) {
        paramVarArgs.g(12, this.rco);
      }
      if (this.rds != null) {
        paramVarArgs.g(13, this.rds);
      }
      if (this.rdt != null) {
        paramVarArgs.g(14, this.rdt);
      }
      if (this.rdu != null) {
        paramVarArgs.g(15, this.rdu);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jTv == null) {
        break label979;
      }
    }
    label979:
    for (paramInt = f.a.a.b.b.a.h(1, this.jTv) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jQb != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jQb);
      }
      i += f.a.a.a.fQ(3, this.rdn);
      paramInt = i;
      if (this.jTu != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jTu);
      }
      i = paramInt + f.a.a.a.fQ(5, this.hcE);
      paramInt = i;
      if (this.jSA != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jSA);
      }
      i = paramInt + f.a.a.a.fQ(7, this.lOH);
      paramInt = i;
      if (this.rdo != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rdo);
      }
      i = paramInt;
      if (this.rdp != null) {
        i = paramInt + f.a.a.a.fS(9, this.rdp.boi());
      }
      i = i + f.a.a.a.fQ(10, this.rdq) + f.a.a.a.fQ(11, this.rdr);
      paramInt = i;
      if (this.rco != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.rco);
      }
      i = paramInt;
      if (this.rds != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.rds);
      }
      paramInt = i;
      if (this.rdt != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.rdt);
      }
      i = paramInt;
      if (this.rdu != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.rdu);
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
        df localdf = (df)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localdf.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localdf.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localdf.rdn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localdf.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localdf.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localdf.jSA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localdf.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localdf.rdo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localdf.rdp = ((bhy)localObject1);
            paramInt += 1;
          }
        case 10: 
          localdf.rdq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localdf.rdr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localdf.rco = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localdf.rds = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localdf.rdt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localdf.rdu = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */