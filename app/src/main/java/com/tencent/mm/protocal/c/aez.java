package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aez
  extends bhd
{
  public int otY;
  public String rDH;
  public bhy rIW;
  public int rIX;
  public int rIY;
  public LinkedList<bat> rIZ = new LinkedList();
  public int rJa;
  public int rfe;
  public aqr rva;
  
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
      paramVarArgs.fT(2, this.rfe);
      paramVarArgs.fT(3, this.otY);
      if (this.rIW != null)
      {
        paramVarArgs.fV(4, this.rIW.boi());
        this.rIW.a(paramVarArgs);
      }
      if (this.rva != null)
      {
        paramVarArgs.fV(5, this.rva.boi());
        this.rva.a(paramVarArgs);
      }
      if (this.rDH != null) {
        paramVarArgs.g(6, this.rDH);
      }
      paramVarArgs.fT(7, this.rIX);
      paramVarArgs.fT(8, this.rIY);
      paramVarArgs.d(11, 8, this.rIZ);
      paramVarArgs.fT(12, this.rJa);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label990;
      }
    }
    label990:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rfe) + f.a.a.a.fQ(3, this.otY);
      paramInt = i;
      if (this.rIW != null) {
        paramInt = i + f.a.a.a.fS(4, this.rIW.boi());
      }
      i = paramInt;
      if (this.rva != null) {
        i = paramInt + f.a.a.a.fS(5, this.rva.boi());
      }
      paramInt = i;
      if (this.rDH != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rDH);
      }
      return paramInt + f.a.a.a.fQ(7, this.rIX) + f.a.a.a.fQ(8, this.rIY) + f.a.a.a.c(11, 8, this.rIZ) + f.a.a.a.fQ(12, this.rJa);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rIZ.clear();
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
        aez localaez = (aez)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 9: 
        case 10: 
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
            localaez.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaez.rfe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localaez.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaez.rIW = ((bhy)localObject1);
            paramInt += 1;
          }
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
            localaez.rva = ((aqr)localObject1);
            paramInt += 1;
          }
        case 6: 
          localaez.rDH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaez.rIX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localaez.rIY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bat();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bat)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaez.rIZ.add(localObject1);
            paramInt += 1;
          }
        }
        localaez.rJa = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */