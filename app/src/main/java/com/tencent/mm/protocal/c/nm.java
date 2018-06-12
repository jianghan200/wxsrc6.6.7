package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class nm
  extends bhd
{
  public String jPc;
  public String jTB;
  public String jTu;
  public int otY;
  public int rdq;
  public String rrA;
  public int rrx;
  public LinkedList<bhz> rry = new LinkedList();
  public String rrz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rdq);
      if (this.jTu != null) {
        paramVarArgs.g(3, this.jTu);
      }
      if (this.jTB != null) {
        paramVarArgs.g(4, this.jTB);
      }
      if (this.jPc != null) {
        paramVarArgs.g(5, this.jPc);
      }
      paramVarArgs.fT(6, this.rrx);
      paramVarArgs.d(7, 8, this.rry);
      if (this.rrz != null) {
        paramVarArgs.g(8, this.rrz);
      }
      if (this.rrA != null) {
        paramVarArgs.g(9, this.rrA);
      }
      paramVarArgs.fT(10, this.otY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label802;
      }
    }
    label802:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rdq);
      paramInt = i;
      if (this.jTu != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jTu);
      }
      i = paramInt;
      if (this.jTB != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jTB);
      }
      paramInt = i;
      if (this.jPc != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.jPc);
      }
      i = paramInt + f.a.a.a.fQ(6, this.rrx) + f.a.a.a.c(7, 8, this.rry);
      paramInt = i;
      if (this.rrz != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rrz);
      }
      i = paramInt;
      if (this.rrA != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rrA);
      }
      return i + f.a.a.a.fQ(10, this.otY);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rry.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        nm localnm = (nm)paramVarArgs[1];
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
            localnm.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localnm.rdq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localnm.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localnm.jTB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localnm.jPc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localnm.rrx = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localnm.rry.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          localnm.rrz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localnm.rrA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localnm.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/nm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */