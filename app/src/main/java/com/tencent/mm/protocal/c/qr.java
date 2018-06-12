package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class qr
  extends bhd
{
  public int hbF;
  public String jPe;
  public String ruY;
  public String ruZ;
  public aqr rva;
  public LinkedList<bhz> rvb = new LinkedList();
  public String rvc;
  public String rvd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rva == null) {
        throw new b("Not all required fields were included: Loc");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.jPe != null) {
        paramVarArgs.g(2, this.jPe);
      }
      if (this.ruY != null) {
        paramVarArgs.g(3, this.ruY);
      }
      if (this.ruZ != null) {
        paramVarArgs.g(4, this.ruZ);
      }
      if (this.rva != null)
      {
        paramVarArgs.fV(5, this.rva.boi());
        this.rva.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.hbF);
      paramVarArgs.d(7, 8, this.rvb);
      if (this.rvc != null) {
        paramVarArgs.g(8, this.rvc);
      }
      if (this.rvd != null) {
        paramVarArgs.g(9, this.rvd);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label905;
      }
    }
    label905:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPe != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPe);
      }
      i = paramInt;
      if (this.ruY != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.ruY);
      }
      paramInt = i;
      if (this.ruZ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.ruZ);
      }
      i = paramInt;
      if (this.rva != null) {
        i = paramInt + f.a.a.a.fS(5, this.rva.boi());
      }
      i = i + f.a.a.a.fQ(6, this.hbF) + f.a.a.a.c(7, 8, this.rvb);
      paramInt = i;
      if (this.rvc != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rvc);
      }
      i = paramInt;
      if (this.rvd != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rvd);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rvb.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rva != null) {
          break;
        }
        throw new b("Not all required fields were included: Loc");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        qr localqr = (qr)paramVarArgs[1];
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
            localqr.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localqr.jPe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localqr.ruY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localqr.ruZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aqr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aqr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localqr.rva = ((aqr)localObject1);
            paramInt += 1;
          }
        case 6: 
          localqr.hbF = ((f.a.a.a.a)localObject1).vHC.rY();
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
            localqr.rvb.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          localqr.rvc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localqr.rvd = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/qr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */